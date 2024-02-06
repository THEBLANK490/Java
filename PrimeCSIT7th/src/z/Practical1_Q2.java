//2.	Create a class Calculate which contains data member num1 and num2 
//both in integer and methods setCalc() to set the data, calcSum() that 
//calculate the sum of num1 and num2 and display the result, calcMulti() 
//that calculate the multiplication of num1 and num2 and returns the result, 
//calcDifference that calculate the difference between num1 and num2 and 
//display the result. Now, create some instance of Calculate and invoke 
//all the methods.
package z;

class Calculate {
    private int num1;
    private int num2;

    public void setCalc(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public void calcSum() {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public int calcMulti() {
        return num1 * num2;
    }

    public void calcDifference() {
        int diff = num1 - num2;
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + diff);
    }
}

public class Practical1_Q2  {
    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        calculator.setCalc(10, 5);
        calculator.calcSum();

        int multiplicationResult = calculator.calcMulti();
        System.out.println("Multiplication of 10 and 5 is: " + multiplicationResult);
        calculator.calcDifference();
    }
}


