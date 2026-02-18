import java.net.*;
import java.io.*;

public class SimplePing {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter host name or IP address to ping: ");
            String host = br.readLine();
            
            InetAddress address = InetAddress.getByName(host);
            System.out.println("\nPinging " + host + " [" + address.getHostAddress() + "]...\n");
            
            long startTime = System.currentTimeMillis();
            boolean reachable = address.isReachable(5000); // timeout in milliseconds
            long endTime = System.currentTimeMillis();
            
            if (reachable) {
                System.out.println("Host is reachable.");
                System.out.println("Approximate Round Trip Time: " + (endTime - startTime) + " ms");
            } else {
                System.out.println("Host is NOT reachable.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}