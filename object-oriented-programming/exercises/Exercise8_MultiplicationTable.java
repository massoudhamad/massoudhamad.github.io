import java.util.Scanner;

/**
 * Exercise 8: Multiplication Table
 * PT821 - Object-Oriented Programming
 *
 * TASK:
 * Create a program that:
 * 1. Asks the user for a number
 * 2. Displays the multiplication table for that number (1-12)
 * 3. Uses a for loop to generate the table
 *
 * CONCEPTS PRACTICED:
 * - for loop
 * - Formatted output (printf)
 * - Multiplication operator
 */
public class Exercise8_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Multiplication Table Generator ===\n");

        // Get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Generate multiplication table using for loop
        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("================================");

        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.printf("%d x %2d = %3d%n", number, i, result);
        }

        System.out.println("================================");

        scanner.close();
    }
}

/*
 * SAMPLE OUTPUT:
 * =============
 *
 * === Multiplication Table Generator ===
 *
 * Enter a number: 7
 *
 * Multiplication Table for 7:
 * ================================
 * 7 x  1 =   7
 * 7 x  2 =  14
 * 7 x  3 =  21
 * 7 x  4 =  28
 * 7 x  5 =  35
 * 7 x  6 =  42
 * 7 x  7 =  49
 * 7 x  8 =  56
 * 7 x  9 =  63
 * 7 x 10 =  70
 * 7 x 11 =  77
 * 7 x 12 =  84
 * ================================
 *
 * EXTENSION CHALLENGE:
 * - Ask user for start and end range
 * - Create a full multiplication table (1-10 x 1-10) using nested loops
 * - Add an option to display tables for multiple numbers
 */
