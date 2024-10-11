//Java Program for Surname and Age

import java.util.Scanner;

public class SurnameAgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user's surname and age
        System.out.print("Enter your surname: ");
        String surname = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        // Print number of characters in surname
        System.out.println("The number of characters in your surname is " + surname.length());
        
        // Check if age is odd or even
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
    }
}


//Java Program to Compute Average Marks:
import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalMarks = 0;
        
        // Input marks for five units
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for unit " + i + ": ");
            double marks = input.nextDouble();
            totalMarks += marks;
        }
        
        // Calculate and display average
        double average = totalMarks / 5;
        System.out.printf("The average marks are: %.2f", average);
    }
}


//Java Program to Check Divisibility:
import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
        }
    }
}


//Java Program to Display Multiples of 2, 3, and 7:
public class Multiples {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}


//Java Calculator Program:
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input numbers and operation
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Perform calculation and display result
        switch (operation) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}

