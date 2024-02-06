package Unit1;
import java.util.*;
//it is a mechanism to handle runtime error.It uses following keywords
//try: used to surround the code that might cause error
//catch: used to handle error that is caught in try 
//throw: used to explicitly throw an error i.e. to throw error from any place
//throws: to handle error that might generate from method

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        try{
            int div = num1/num2;//if num2 =0 arithmethic except is generated
            int arr1[] = new int[3];
            arr1[0] = 5;
            arr1[1] = 10;
            arr1[2] = 15;
            arr1[10] = 100;//beyond size error will occur
            
        }catch(ArithmeticException a){
            System.out.println("Denominator cannot be 0 " + a);
        }catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Size of array exceeded. "+b);
            
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //any thing inside finally block is run whether exception occur ir not
            System.out.println("Code is inside finally block runs whether exception occurs ir not");
        }
        System.out.println("Out of catch block");
        System.out.println("See ya!!!!");
        
    }
}
