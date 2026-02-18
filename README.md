# SimplePing-Java
A simple Java networking program that checks whether a given host (IP address or domain name) is reachable using the InetAddress class and displays the approximate round-trip time.

 Description
Simple Ping Program in Java is a basic networking application that checks whether a specified host (IP address or domain name) is reachable from the local system.
The program uses Java’s InetAddress class to resolve the hostname into an IP address and attempts to verify connectivity within a given timeout period. It also calculates the approximate round-trip time.
This project demonstrates fundamental Java networking concepts and basic network diagnostics.

Technologies Used
•	Java
•	java.net package
•	java.io package

 Features
•	Accepts host name or IP address as user input
•	Resolves hostname to IP address
•	Checks host reachability using isReachable()
•	Displays reachability status
•	Calculates approximate round-trip time
•	Handles exceptions gracefully

 How to Run
1. Compile the program
javac SimplePing.java
2. Run the program
java SimplePing
3. Enter host
Example:
google.com
8.8.8.8
localhost

Concepts Covered
•	IP Address Resolution
•	Network Connectivity Testing
•	Timeout Handling
•	Exception Handling
•	Basic Java Networking

 Future Improvements
•	Add GUI using Swing
•	Multi-host ping checker
•	Port scanning feature
•	Save ping results to a file
•	Display detailed statistics like system ping
