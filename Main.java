
/* ==========================================
   EXPERIMENT 5: CALCULATOR
   ========================================== */

package org.example;

import java.util.Scanner;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        try {
            System.out.println("Division: " + divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}


/* ==========================================
   EXPERIMENT 6: STUDENT PASS OR FAIL
   ========================================== */

package org.example;

import java.util.Scanner;

public class Main {

    public static boolean isPassed(int marks) {
        return marks >= 50;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (isPassed(marks)) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}


/* ==========================================
   EXPERIMENT 7: LEAP YEAR
   ========================================== */

package org.example;

import java.util.Scanner;

public class Main {

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close();
    }
}


/* ==========================================
   EXPERIMENT 8: PURCHASE DISCOUNT
   ========================================== */

package org.example;

import java.util.Scanner;

public class Main {

    public static double calculateFinalAmount(double amount) {

        if (amount >= 1000) {
            return amount - (amount * 0.10);
        }
        else {
            return amount;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double finalAmount = calculateFinalAmount(amount);

        System.out.println("Final Purchase Amount: Rs. " + finalAmount);

        sc.close();
    }
}
