package main.java.com.makkkkkkkks.safeDivision;

import java.util.Scanner;

public class SafeDivision {
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number =>");
        int a = scanner.nextInt();
        System.out.println("Enter second number=>");
        int b = scanner.nextInt();
        try {
            System.out.println(a / b);
            if (b == 0) {
                throw new ArithmeticException("division by 0");
            }
        } catch (ArithmeticException ArithmeticException) {
            System.out.println("You're trying to divide by zero, reenter b ");
            b = scanner.nextInt();
            System.out.println(a / b);
        }
    }
}
