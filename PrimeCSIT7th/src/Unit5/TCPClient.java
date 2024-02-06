package Unit5;

/**
 * TCPClient
 */
import java.net.*;
import java.io.*;

public class TCPClient {
    private Socket skt=null;//client socket
    private DataInputStream in=null;//input stream
    private DataOutputStream out=null;//output stream
    //constructor to put ip address and port
    public TCPClient(String address,int port){
        try{
            skt=new Socket(address,port);
            System.out.println("Connected");
            in=new DataInputStream(System.in);
            out=new DataOutputStream(skt.getOutputStream());
        }catch(UnknownHostException u){
            System.out.println(u);
        }catch(IOException i){
            System.out.println(i);
        }
        String line="";
        while(!line.equals("out")){
            try{
                line=in.readLine();
                out.writeUTF(line);
            }catch(IOException i){
                System.out.println(i);
            }
        }
        try{
            in.close();
            out.close();
            skt.close();
        }catch(IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TCPClient client=new TCPClient("localhost",5000);
    }
    
    
}
