package Unit5;

import java.io.*;
import java.net.*;

public class TCPServer {
    private Socket clientSocket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream in = null;

    public TCPServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for client");

            // Accept client connection
            clientSocket = serverSocket.accept();
            System.out.println("Client accepted");

            // Set up input stream
            in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));

            String line = "";

            // Read messages until "out" is received
            while (!line.equals("out")) {
                try {
                    line = in.readUTF();
                    System.out.println("Client: " + line);
                } catch (IOException e) {
                    System.out.println("Error reading from client: " + e.getMessage());
                }
            }

            System.out.println("Closing connection");
        } catch (IOException e) {
            System.out.println("Error in the server: " + e.getMessage());
        } finally {
            try {
                // Close resources in the finally block to ensure they are closed
                if (in != null) in.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        TCPServer server = new TCPServer(5000);
    }
}
