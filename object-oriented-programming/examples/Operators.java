/**
 * Java Basics: Operators
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - Arithmetic operators (+, -, *, /, %)
 * - Assignment operators (=, +=, -=, *=, /=)
 * - Comparison operators (==, !=, >, <, >=, <=)
 * - Logical operators (&&, ||, !)
 * - Increment/Decrement operators (++, --)
 */
public class Operators {
    public static void main(String[] args) {

        // ============================================
        // 1. ARITHMETIC OPERATORS
        // ============================================
        System.out.println("=== Arithmetic Operators ===");

        int a = 20;
        int b = 7;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));        // 27
        System.out.println("Subtraction (a - b): " + (a - b));     // 13
        System.out.println("Multiplication (a * b): " + (a * b));  // 140
        System.out.println("Division (a / b): " + (a / b));        // 2 (integer division)
        System.out.println("Modulus (a % b): " + (a % b));         // 6 (remainder)

        // Division with decimals
        double x = 20.0;
        double y = 7.0;
        System.out.println("Double division (20.0 / 7.0): " + (x / y));

        // ============================================
        // 2. ASSIGNMENT OPERATORS
        // ============================================
        System.out.println("\n=== Assignment Operators ===");

        int num = 10;
        System.out.println("Initial value: num = " + num);

        num += 5;  // Same as: num = num + 5
        System.out.println("After num += 5: " + num);   // 15

        num -= 3;  // Same as: num = num - 3
        System.out.println("After num -= 3: " + num);   // 12

        num *= 2;  // Same as: num = num * 2
        System.out.println("After num *= 2: " + num);   // 24

        num /= 4;  // Same as: num = num / 4
        System.out.println("After num /= 4: " + num);   // 6

        num %= 4;  // Same as: num = num % 4
        System.out.println("After num %= 4: " + num);   // 2

        // ============================================
        // 3. COMPARISON OPERATORS
        // ============================================
        System.out.println("\n=== Comparison Operators ===");

        int p = 10;
        int q = 20;

        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q: " + (p == q));   // false (equal to)
        System.out.println("p != q: " + (p != q));   // true (not equal to)
        System.out.println("p > q: " + (p > q));     // false (greater than)
        System.out.println("p < q: " + (p < q));     // true (less than)
        System.out.println("p >= q: " + (p >= q));   // false (greater or equal)
        System.out.println("p <= q: " + (p <= q));   // true (less or equal)

        // ============================================
        // 4. LOGICAL OPERATORS
        // ============================================
        System.out.println("\n=== Logical Operators ===");

        boolean sunny = true;
        boolean warm = false;

        System.out.println("sunny = " + sunny + ", warm = " + warm);

        // AND operator (&&) - both must be true
        System.out.println("sunny && warm: " + (sunny && warm));  // false

        // OR operator (||) - at least one must be true
        System.out.println("sunny || warm: " + (sunny || warm));  // true

        // NOT operator (!) - reverses the value
        System.out.println("!sunny: " + (!sunny));  // false
        System.out.println("!warm: " + (!warm));    // true

        // Combining conditions
        int age = 25;
        boolean hasLicense = true;

        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("\nCan drive (age >= 18 && hasLicense): " + canDrive);

        // ============================================
        // 5. INCREMENT AND DECREMENT OPERATORS
        // ============================================
        System.out.println("\n=== Increment/Decrement Operators ===");

        int counter = 5;
        System.out.println("Initial counter: " + counter);

        // Post-increment (uses value, then increments)
        System.out.println("counter++: " + counter++);  // Prints 5
        System.out.println("After post-increment: " + counter);  // Now 6

        // Pre-increment (increments first, then uses value)
        System.out.println("++counter: " + ++counter);  // Prints 7

        // Post-decrement
        System.out.println("counter--: " + counter--);  // Prints 7
        System.out.println("After post-decrement: " + counter);  // Now 6

        // Pre-decrement
        System.out.println("--counter: " + --counter);  // Prints 5

        // ============================================
        // 6. PRACTICAL EXAMPLE
        // ============================================
        System.out.println("\n=== Practical Example: Calculate Grade ===");

        int exam1 = 85;
        int exam2 = 90;
        int exam3 = 78;

        double average = (exam1 + exam2 + exam3) / 3.0;
        boolean passed = average >= 50;

        System.out.println("Exam scores: " + exam1 + ", " + exam2 + ", " + exam3);
        System.out.println("Average: " + average);
        System.out.println("Passed: " + passed);
    }
}
