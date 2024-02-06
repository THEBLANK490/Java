package z;
//1.	Write a program to create a class, instance variable, constructor and 
//method. After this create a class FirstDemo with main method and access the 
//member of above class.

class MyClass {
    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    public void get_message() {
        System.out.println("This is from my class: " + message);
    }
}

public class Practical1_Q1 {

    public static void main(String[] args) {
        MyClass m = new MyClass("hello");
        m.get_message();

    }
}
