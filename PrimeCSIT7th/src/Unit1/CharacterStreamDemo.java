/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.io.*;

//uses two class for reading and writing
//FileReader: to read data from file
//FileWriter: to write data into file 
public class CharacterStreamDemo {
    public static void main(String[] args) {
        try{
            //Writing through character stream
            FileWriter fw = new FileWriter("csitA.txt");
            String msg = "This is second last class of basics";
            fw.write(msg);
            System.out.println("Contetnt written successfully");
            fw.close();
            //reading from file through character stream
            FileReader fr = new FileReader("csitA.txt");
            int res;
            while((res=fr.read())!=-1){
                System.out.print((char)res);
            }
            fr.close();
            
         }catch(IOException i){
            System.out.println(i);
        
        }
    }
    
}
