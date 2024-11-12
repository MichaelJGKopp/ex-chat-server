### Exercise: Simulated Chat Server with Virtual Threads

### Objective:
- Simulate a chat server where multiple clients send and receive messages concurrently using virtual threads.

### Instructions:
#### 1.	Create a ChatClient class:
 - The ChatClient class represents a client connected to the server.
 - Each client should have:
    -	A String clientName to identify the client.
    -	A method that simulates sending messages by printing "<clientName> is sending a message", with a random delay between messages to simulate typing time.
    -	A method that simulates receiving messages by printing "<clientName> received a message", also with a random delay to simulate network latency.
#### 2.	Implement a main class with the following logic:
  -	Create a list of chat clients
  -	Use an ExecutorService with virtual threads to simulate each client sending and receiving messages concurrently.
  -	Submit a task for each client that:
    -	Calls the method that sends messages 3 times.
    -	Calls the method that receives messages 3 times.
  -	Print a message at the end indicating all clients have finished their communication.
#### 3.	Use virtual threads:
  -	Use Executors.newVirtualThreadPerTaskExecutor() to create an executor that can handle each client’s communication tasks concurrently.
  -	Use lambdas to submit each client’s send and receive tasks to the executor.
