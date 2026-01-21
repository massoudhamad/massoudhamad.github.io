import java.util.Scanner;

/**
 * Java Basics: Input and Output
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - Output: print(), println(), printf()
 * - Input: Scanner class methods
 * - String formatting
 */
public class InputOutput {
    public static void main(String[] args) {
        // Create Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // ============================================
        // 1. OUTPUT METHODS
        // ============================================
        System.out.println("=== Output Methods ===\n");

        // print() - prints without newline
        System.out.print("This is print(). ");
        System.out.print("Still on same line.\n");  // \n adds newline

        // println() - prints with newline
        System.out.println("This is println(). New line after.");
        System.out.println("This is on a new line.");

        // printf() - formatted printing
        String name = "Ali";
        int age = 20;
        double gpa = 3.75;

        System.out.println("\n--- Using printf() ---");
        System.out.printf("Name: %s, Age: %d, GPA: %.2f%n", name, age, gpa);

        // Common format specifiers:
        // %s - String
        // %d - Integer (decimal)
        // %f - Floating point
        // %.2f - Float with 2 decimal places
        // %n - Platform-independent newline
        // %10s - String with width 10 (right-aligned)
        // %-10s - String with width 10 (left-aligned)

        System.out.println("\n--- Formatting Examples ---");
        System.out.printf("Integer: %d%n", 42);
        System.out.printf("Float: %f%n", 3.14159);
        System.out.printf("Float (2 decimals): %.2f%n", 3.14159);
        System.out.printf("Right-aligned (10): |%10s|%n", "Java");
        System.out.printf("Left-aligned (10):  |%-10s|%n", "Java");

        // ============================================
        // 2. INPUT WITH SCANNER
        // ============================================
        System.out.println("\n=== Input with Scanner ===\n");

        // Reading a String (single word)
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();  // Reads until space

        // Reading an integer
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        // Reading a double
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Clear the buffer (important after nextInt/nextDouble before nextLine)
        scanner.nextLine();

        // Reading a full line (including spaces)
        System.out.print("Enter your full address: ");
        String address = scanner.nextLine();

        // Display the input
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + userAge);
        System.out.printf("Height: %.2f meters%n", height);
        System.out.println("Address: " + address);

        // ============================================
        // 3. SCANNER METHODS SUMMARY
        // ============================================
        System.out.println("\n=== Scanner Methods Summary ===");
        System.out.println("next()       - reads a single word (until space)");
        System.out.println("nextLine()   - reads entire line (including spaces)");
        System.out.println("nextInt()    - reads an integer");
        System.out.println("nextDouble() - reads a double");
        System.out.println("nextFloat()  - reads a float");
        System.out.println("nextBoolean()- reads a boolean (true/false)");
        System.out.println("nextLong()   - reads a long integer");

        // ============================================
        // 4. PRACTICAL EXAMPLE
        // ============================================
        System.out.println("\n=== Practical Example: Simple Calculator ===\n");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- Results ---");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, (num1 + num2));
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, (num1 - num2));
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, (num1 * num2));
        if (num2 != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // Always close the scanner when done
        scanner.close();

        System.out.println("\nProgram ended. Thank you!");
    }
}
