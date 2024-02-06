package Unit1;
import java.io.*;
//serialization is the process of writing object to a file.
//deserialization is a process of reading object from a file.
//two classes are used
//ObjectOutputStream: to write the objecct
//ObjectInputStream: to read the object

class Rectangle implements Serializable{
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void calcArea(){
        System.out.println("Area is "+(this.length*this.breadth));
    }
    public void calcPeri(){
        System.out.println("Perimeter is "+(2*(this.length+this.breadth)));
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20,30);
        try{
            //Opening a file in write mode 
            //serialization
            FileOutputStream fis = new FileOutputStream("csitA.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
               oos.writeObject(r1);
               System.out.println("Object written into File.");
               fis.close();
               oos.close();
               //deserialization
               FileInputStream fs = new FileInputStream("csitA.txt");
               ObjectInputStream ois = new ObjectInputStream(fs);
               Rectangle r2 = (Rectangle)ois.readObject();
               r2.calcArea();
               r2.calcPeri();
               fs.close();
               ois.close();
            
        }catch(IOException i){
            System.out.println(i);
        
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
    }
    
}
