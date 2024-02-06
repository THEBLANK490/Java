package Unit1;
import java.io.*;

//Stream is a sequence of data. It is used for reading and writing data in file
//ByteStream: read and write data through sequence of byte.Two classes are used
//FileInputStream: to read data from file through byte stream
//FileOutputStream: 

public class ByteStreamDemo {
    public static void main(String[] args) {
        //writing into file using byte stream
        try{
            FileOutputStream fos = new FileOutputStream("csitA.txt");
            String msg = "This is file handling class";
            //Converting into byte
            byte[]b1 = msg.getBytes();
            fos.write(b1);
            System.out.println("Content written successfully.");
            fos.close();
            //reading fromm file using byte stream
            FileInputStream fis = new FileInputStream("csitA.txt");
            int res;
            while((res=fis.read())!=-1){
                System.out.print((char)res);
            }
            fis.close();
        }catch(IOException i){
            System.out.println(i);
        
        }
    }
    
}
