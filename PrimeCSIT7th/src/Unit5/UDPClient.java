//here in UDP client is also referred as datagramSocket
package Unit5;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            //creating socket for carrying data
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip =InetAddress.getLocalHost();
            byte buff[]=null;
            //accept input till out is type
            System.out.println("Enter any thing you want to send");
            System.out.println("Enter out to end");
            while(true){
                String str = sc.nextLine();
                buff = str.getBytes();//extracting byte from string value
                //create packet for sending data
                DatagramPacket pkt = new DatagramPacket(buff,buff.length,ip,1234);
                //sending data using send()
                ds.send(pkt);
                if(str.equals("out")){
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
