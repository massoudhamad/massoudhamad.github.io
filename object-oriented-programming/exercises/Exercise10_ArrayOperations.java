import java.util.Scanner;

/**
 * Exercise 10: Array Operations
 * PT821 - Object-Oriented Programming
 *
 * TASK:
 * Create a program that:
 * 1. Asks user for 5 numbers and stores them in an array
 * 2. Calculates and displays:
 *    - All the numbers
 *    - Sum of all numbers
 *    - Average of all numbers
 *    - Maximum value
 *    - Minimum value
 *
 * CONCEPTS PRACTICED:
 * - Array declaration and initialization
 * - for loop with arrays
 * - Finding sum, average, max, min
 * - Scanner for array input
 */
public class Exercise10_ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Array Operations ===\n");

        // Declare array of 5 integers
        int[] numbers = new int[5];

        // Get numbers from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display all numbers
        System.out.println("\n--- Your Numbers ---");
        System.out.print("[ ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Find maximum
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        // Find minimum
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        // Display results
        System.out.println("\n--- Statistics ---");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}

/*
 * SAMPLE OUTPUT:
 * =============
 *
 * === Array Operations ===
 *
 * Enter 5 numbers:
 * Number 1: 45
 * Number 2: 82
 * Number 3: 33
 * Number 4: 91
 * Number 5: 67
 *
 * --- Your Numbers ---
 * [ 45 82 33 91 67 ]
 *
 * --- Statistics ---
 * Sum: 318
 * Average: 63.60
 * Maximum: 91
 * Minimum: 33
 *
 * EXTENSION CHALLENGE:
 * - Allow user to specify array size
 * - Add search functionality (find if a number exists)
 * - Sort the array and display
 * - Count even and odd numbers
 */
