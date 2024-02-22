package SetB;

abstract class Calculation {
    public int add(int x, int y) {
        return x + y;
    }

    public abstract int mul(int x, int y);
}

class Demo extends Calculation {
    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    public int calcDiv(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return x / y;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Demo demo = new Demo();

        // Demonstrate add and mul methods from Calculation class
        System.out.println("Addition result: " + demo.add(10, 20));
        System.out.println("Multiplication result: " + demo.mul(5, 5));

        // Demonstrate calcDiv method from Demo class
        System.out.println("Division result: " + demo.calcDiv(100, 20));

        // Access add and mul methods from Calculation class using reference of abstract class
        Calculation calculation = new Demo();
        System.out.println("Addition result (using abstract class reference): " + calculation.add(6, 9));
        System.out.println("Multiplication result (using abstract class reference): " + calculation.mul(9, 6));

    }
}