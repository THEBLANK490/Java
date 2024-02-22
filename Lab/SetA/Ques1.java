package SetA;

// Static polymorphism
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Dynamic polymorphism
class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}


public class Ques1 {
     public static void main(String[] args) {
        // Static polymorphism
        Calculator calculator = new Calculator();
        System.out.println("Adding integers: " + calculator.add(5, 10));
        System.out.println("Adding doubles: " + calculator.add(5.5, 10.5));

        // Dynamic polymorphism
        Animal animal = new Dog(); // Upcasting
        animal.speak(); // Output will be "Dog barks"
    }
}
