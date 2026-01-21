/**
 * Java Basics: Loops
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - for loop
 * - while loop
 * - do-while loop
 * - Enhanced for loop (for-each)
 * - break and continue statements
 * - Nested loops
 */
public class Loops {
    public static void main(String[] args) {

        // ============================================
        // 1. FOR LOOP
        // ============================================
        System.out.println("=== for Loop ===\n");

        // Basic for loop: for (initialization; condition; update)
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Counting backwards
        System.out.println("\nCounting from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        // Step by 2
        System.out.println("\nEven numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sum of numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("\nSum of 1 to 10: " + sum);

        // ============================================
        // 2. WHILE LOOP
        // ============================================
        System.out.println("\n=== while Loop ===\n");

        // while loop: while (condition) { ... }
        System.out.println("Counting from 1 to 5:");
        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }

        // Practical example: Find how many times a number can be divided by 2
        int number = 64;
        int divisions = 0;
        int temp = number;

        while (temp > 1) {
            temp = temp / 2;
            divisions++;
        }
        System.out.println("\n" + number + " can be divided by 2: " + divisions + " times");

        // ============================================
        // 3. DO-WHILE LOOP
        // ============================================
        System.out.println("\n=== do-while Loop ===\n");

        // do-while: always executes at least once
        // do { ... } while (condition);

        System.out.println("Counting from 1 to 5:");
        int num = 1;
        do {
            System.out.println("num = " + num);
            num++;
        } while (num <= 5);

        // Difference between while and do-while
        System.out.println("\n--- Difference: while vs do-while ---");

        int x = 10;

        // This won't print anything (condition false from start)
        System.out.print("while (x < 5): ");
        while (x < 5) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println("(nothing printed)");

        // This prints once even though condition is false
        x = 10;
        System.out.print("do-while (x < 5): ");
        do {
            System.out.print(x + " ");
            x++;
        } while (x < 5);
        System.out.println("(printed once)");

        // ============================================
        // 4. ENHANCED FOR LOOP (FOR-EACH)
        // ============================================
        System.out.println("\n=== Enhanced for Loop (for-each) ===\n");

        // Used primarily with arrays and collections
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int n : numbers) {
            System.out.println(n);
        }

        String[] names = {"Ali", "Fatma", "Hassan", "Amina"};

        System.out.println("\nStudent names:");
        for (String name : names) {
            System.out.println("- " + name);
        }

        // ============================================
        // 5. BREAK STATEMENT
        // ============================================
        System.out.println("\n=== break Statement ===\n");

        // break exits the loop immediately
        System.out.println("Finding first number divisible by 7:");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Found: " + i);
                break;  // Exit the loop
            }
        }

        // Search example
        int[] scores = {85, 92, 78, 95, 88};
        int searchValue = 95;
        boolean found = false;

        for (int score : scores) {
            if (score == searchValue) {
                found = true;
                break;
            }
        }
        System.out.println("Score " + searchValue + " found: " + found);

        // ============================================
        // 6. CONTINUE STATEMENT
        // ============================================
        System.out.println("\n=== continue Statement ===\n");

        // continue skips the rest of current iteration
        System.out.println("Numbers 1-10, skipping multiples of 3:");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;  // Skip this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Print only positive numbers
        int[] mixedNumbers = {-3, 5, -1, 8, -2, 10, 3};
        System.out.println("\nPositive numbers only:");
        for (int n : mixedNumbers) {
            if (n < 0) {
                continue;  // Skip negative numbers
            }
            System.out.print(n + " ");
        }
        System.out.println();

        // ============================================
        // 7. NESTED LOOPS
        // ============================================
        System.out.println("\n=== Nested Loops ===\n");

        // Multiplication table
        System.out.println("Multiplication Table (1-5):");
        System.out.println("    1   2   3   4   5");
        System.out.println("  +---+---+---+---+---+");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }

        // Pattern printing
        System.out.println("\nTriangle pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted triangle
        System.out.println("\nInverted triangle:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ============================================
        // 8. PRACTICAL EXAMPLES
        // ============================================
        System.out.println("\n=== Practical Examples ===\n");

        // Factorial
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " = " + factorial);

        // Fibonacci sequence
        System.out.print("First 10 Fibonacci numbers: ");
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // Prime numbers between 1 and 30
        System.out.print("Prime numbers (1-30): ");
        for (int i = 2; i <= 30; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
