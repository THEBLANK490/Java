/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.util.*;

/**
 *
 * @author Sanis
 */
public class ClassConceptDemo {
    public static void main(String[] args) {
        System.out.println("Hello CSIT 7th");
//        To take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = sc.nextInt(); // to read int
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        System.out.println("Sum is: "+sum);
        System.out.println("Difference is: "+difference);
        System.out.println("Multiply is: "+multiply);
        System.out.println("Division is: "+division);
    }
    
}
