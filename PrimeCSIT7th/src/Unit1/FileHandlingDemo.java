package Unit1;
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        //creating new file 
        try{
            File f1 = new File("csitA.txt");
            if(!f1.exists()){
                f1.createNewFile();
                System.out.println("New FIle Created");
            }else{
                System.out.println("File already create");
            }
            //some file handling methhod
            System.out.println("FIle name is: "+f1.getName());
            System.out.println("Relative Path is: "+f1.getPath());
            System.out.println("Absolute Path is: "+f1.getAbsolutePath());
        
        }catch(IOException i){
            System.out.println(i);
        
        }
}
}
