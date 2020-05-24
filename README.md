# Shared-Memory-Message-Passing-System
Shared-Memory in the message passing system

Development of a distributed systems environment.
Building Shared memory in Message processing system using the Zookeeper service and gRPC framework

The prototype is based on the research paper "Sharing Memory Robustly in Message-Passing Systems" by Hagit Attiya, Amotz Ba.r-Noy, and Danny Dolev


Emulators that translate algorithms from the shared-memory model to two different messagepassing
models are presented. Both are achieved by implementing a wait-free, atomic, singlewriter
multi-reader register in unreliable, asynchronous networks. The two message-passing
models considered are a complete network with processor failures and an arbitrary network
with dynamic link failures.
These results make it possible to view the shared-memory model as a higher-level lan
guage for designing algorithms in asynchronous distributed systems. Any wait-free algorithm
based on atomic, single-writer multi-reader registers can be automatically emulated in messagepassing
systems. The overhead introduced by these emulations is polynomial in the number of
processors in the systems.
Immediate new results are obtained by applying the emulators to known shared-memory
algorithms. These include, among others, protocols to solve the following problems in the
message-passing model in the presence of processor or link failures; multi-writer multi-reader
registers, concurrent time-stamp systems, £-exclusion, atomic snapshots, randomized consen
sus, and implementation of a class of data structures[1].

[1] H. Attiya, A. Bar-Noy and D. Dolev, "Sharing Memory Robustly in Message-Passing Systems", JACM, pp. 124-142, Jan. 1995
