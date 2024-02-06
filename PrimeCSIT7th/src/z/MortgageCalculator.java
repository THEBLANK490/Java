package z;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        long principal;
        double annualInterest;
        double monthlyInterest;
        int numberOfPayments;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Principal: ");
            principal = sc.nextLong();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter the value between 1000 and 1000000");
        }

        while (true) {
            System.out.println("Enter the Annual Interest Rate: ");
            annualInterest = sc.nextDouble();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30. ");
        }

        while (true) {
            System.out.println("Enter the Period(Years): ");
            byte years = sc.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the value between 1 and 30.");
        }
        double pow = Math.pow(1 + monthlyInterest, numberOfPayments);
        double mortgage = principal * ((monthlyInterest * pow) / pow - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
