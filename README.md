# SimplePing-Java

Project Description
This project demonstrates how to check whether a host (website or IP address) is reachable using Java's InetAddress class.
The program takes a hostname or IP address as input and checks its connectivity status by sending a request using the isReachable() method.

Technologies Used
-Java
-java.net package
-java.io package

How It Works
-Takes host name or IP address from the user
-Converts the host name into an IP address
-Uses isReachable(timeout) method
-Measures round-trip time
-Displays whether the host is reachable or not

How to Run the Program
-Step 1: Compile
javac SimplePing.java
-Step 2: Run
java SimplePing
-Step 3: Enter Host
Example:
google.com

Sample Output
Enter host name or IP address to ping: google.com
Pinging google.com [142.250.182.14]...
Host is reachable.
Approximate Round Trip Time: 45 ms

Learning Outcomes
-Understanding of Java Networking
-Working with InetAddress class
-Handling exceptions in Java
-Measuring execution time

Future Improvements
-Multiple ping requests
-Display packet loss statistics
-GUI version using Swing or JavaFX
-Add logging feature
