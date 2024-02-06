//In network programming shows how data are transmitted in network using UDP and TCP
//In UDP packet are transmitted in form of datagram.
//In NP, client is known as socket and server is known as socketserver
//In UDP both client and server is known as DataGramSocket, and packet is known as datagrampacket
//We need to import java.net package for NP
package Unit5;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        //creating socket to listen on port 1234
        try{
            DatagramSocket sc = new DatagramSocket(1234);
            byte[]rcv = new byte[6000];
            //datagram packet: packet for UDP
            DatagramPacket rc = null;
            System.out.println("Server Started");
            System.out.println("Waiting for client.....");
            while(true){
                //creating packet to receive data
                rc = new DatagramPacket(rcv,rcv.length);
                //reveiving data
                sc.receive(rc);
                //rcv is sent as parameter to method data which will convert byte to string
                System.out.println("Client: "+data(rcv));
                //exit server if out is received
                if(data(rcv).toString().equals("out")){
                    System.out.println("Client sent out so exiting server");
                    break;
                }
                //clearing buffer
                rcv = new byte[6000];
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //converting byte array to string
    public static StringBuilder data(byte[]a){
        if(a==null){
            return null;
        }
        StringBuilder bld = new StringBuilder();
        int i=0;
        while(a[i]!=0){
            bld.append((char)a[i]);
            i++;
        }
        return bld;
        
    }
}
