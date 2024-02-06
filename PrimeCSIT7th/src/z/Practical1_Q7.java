package z;


class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Bulldog extends Dog {
    public void guard() {
        System.out.println("Bulldog is guarding.");
    }
}

public class Practical1_Q7 {
    public static void main(String[] args) {
        Bulldog myBulldog = new Bulldog();

        myBulldog.eat(); 
        myBulldog.bark();   
        myBulldog.guard();  
    }
}

