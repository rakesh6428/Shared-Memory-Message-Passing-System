package edu.sjsu.cs249.adb;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.Port;

import com.google.protobuf.Empty;

import edu.sjsu.cs249.adb.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ABDServer extends ABDServiceGrpc.ABDServiceImplBase {
    private Server server;
    private Connection conn =null;
    private Statement st = null;
    private ResultSet result = null;
    public ABDServer(int port) {
        this.server = ServerBuilder.forPort(port).addService(this).build();
    }
    

    public void updateData(Read2Request request)
	{
		try {
	    	conn = ConnectionManager.getConnection();
	    	String register = request.getRegister();
	    	st = conn.createStatement();
	    	String select = "select register from gRPC.gRPC_Implementation where register = '" + register + "'";
	    	result=st.executeQuery(select);
	    	String update = " update gRPC.gRPC_Implementation set Timestamp =?,Value= ?,Register = ? where register =?";
            
	        PreparedStatement preparedStmt = conn.prepareStatement(update);
	        preparedStmt.setLong (1, request.getTimestamp());
	        preparedStmt.setString(2, request.getValue());
	        preparedStmt.setString (3, request.getRegister());
	        preparedStmt.setString (4, request.getRegister());
	        preparedStmt.execute();
	        System.out.println("Learnt the latest value successfully!");
	        
		}
		catch(Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
	}
	
	public void insertData(WriteRequest request)
	{
		try {
	    	conn = ConnectionManager.getConnection();
	    	String register = request.getRegister();
	    	st = conn.createStatement();
	    	String select = "select register from gRPC.gRPC_Implementation where register = '" + register + "'";
	    	result=st.executeQuery(select);
	    	
	    	if(result.next()!=false) {
	    	String existingRegister = result.getString("register");
	    
	    	if(existingRegister.equals(register)) {
	    		System.out.println("Ïnside Update loop");
	    		String update = " update gRPC.gRPC_Implementation set Timestamp =?,Value= ? where register =?";
		             
		        PreparedStatement preparedStmt = conn.prepareStatement(update);
		        preparedStmt.setLong (1, request.getTimestampe());
		        preparedStmt.setString(2, request.getValue());
		        preparedStmt.setString (3, request.getRegister());
		        preparedStmt.execute();
	    	}}
	    	else {
	        String query = " insert into gRPC_Implementation (Timestamp,Register, Value)"
	                + " values (?, ?, ?)";
	        PreparedStatement preparedStmt = conn.prepareStatement(query);
	        preparedStmt.setLong (1, request.getTimestampe());
	        preparedStmt.setString (2, request.getRegister());
	        preparedStmt.setString   (3, request.getValue());
	        preparedStmt.execute();
	    	}
	    	System.out.println("Data written successfully!");
	        conn.close();
	    	}
	    	catch(Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	        } 
	      
	}
   
	

    @Override
    public void read1(Read1Request request, StreamObserver<Read1Response> responseObserver) {
    	try {
    	conn = ConnectionManager.getConnection();
    	st = conn.createStatement();
        String query ="select Timestamp,Value from gRPC.gRPC_Implementation where Register = '"+request.getRegister()+"'";
        //System.out.println(System.currentTimeMillis());
        result = st.executeQuery(query);
       if(result != null)
       {
    	   while(result.next())
        {
        	Read1Response rsp = Read1Response.newBuilder().setTimestamp(result.getLong("Timestamp")).setValue(result.getString("Value")).build();
            responseObserver.onNext(rsp);
        		
        }
    	}
        
        else {
        	Read1Response rsp = Read1Response.newBuilder().setTimestamp(0).setValue(result.getString("")).build();
        	responseObserver.onNext(rsp);
        }
        
        result.close();
        System.out.println("Provided data after read1");
        responseObserver.onCompleted();
        
    	}
    	catch(Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    	finally {
    		
    	}
    }

	@Override
	public void name(Empty request, StreamObserver<NameResponse> responseObserver) {
		// TODO Auto-generated method stub
		String hostname = "Unknown";

		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		NameResponse name = NameResponse.newBuilder().setName(hostname).build();
		responseObserver.onNext(name);
		responseObserver.onCompleted();
	}

	@Override
    public void read2(Read2Request request, StreamObserver<AckResponse> responseObserver) {
		 updateData(request);
		 AckResponse rsp1 = AckResponse.newBuilder().build();
	     responseObserver.onNext(rsp1);
	     responseObserver.onCompleted();
    }
	
    @Override
    public void write(WriteRequest request, StreamObserver<AckResponse> responseObserver) {
    	System.out.println(request.getRegister());
   	 System.out.println(request.getTimestampe());
   	 System.out.println(request.getValue());
    	insertData(request);
    	 
		 AckResponse rsp1 = AckResponse.newBuilder().build();
	     responseObserver.onNext(rsp1);
	     responseObserver.onCompleted();
	     
    }

    public static void main(String args[]) throws Exception {
    	System.out.println("Enter the port on which server has to run:");
    	Scanner portInput = new Scanner( System.in );
    	int portNumber = portInput.nextInt();
        ABDServer server = new ABDServer(portNumber);
        server.server.start();
        System.out.println("server started on "+portNumber);
        server.server.awaitTermination(15,TimeUnit.SECONDS);
    }
}