/**
 * Java Basics: Methods (Functions)
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - Method declaration and calling
 * - Parameters and return values
 * - void methods vs methods that return values
 * - Method overloading
 */
public class Methods {

    public static void main(String[] args) {
        System.out.println("=== Java Methods Examples ===\n");

        // ============================================
        // 1. CALLING SIMPLE METHODS
        // ============================================

        // Calling a void method (no return value)
        sayHello();
        greet("Fatma");
        greet("Hassan");

        // ============================================
        // 2. METHODS WITH RETURN VALUES
        // ============================================
        System.out.println("\n--- Methods with Return Values ---");

        int sum = add(10, 20);
        System.out.println("add(10, 20) = " + sum);

        double result = multiply(3.5, 2.0);
        System.out.println("multiply(3.5, 2.0) = " + result);

        int max = findMax(15, 27);
        System.out.println("findMax(15, 27) = " + max);

        // Using return value directly
        System.out.println("add(5, 3) + multiply(2, 4) = " + (add(5, 3) + multiply(2, 4)));

        // ============================================
        // 3. METHODS WITH MULTIPLE PARAMETERS
        // ============================================
        System.out.println("\n--- Methods with Multiple Parameters ---");

        double average = calculateAverage(85, 90, 78);
        System.out.printf("Average of 85, 90, 78 = %.2f%n", average);

        printStudentInfo("Ali", 20, 3.75);

        // ============================================
        // 4. METHOD OVERLOADING
        // ============================================
        System.out.println("\n--- Method Overloading ---");

        // Same method name, different parameters
        System.out.println("add(5, 10) = " + add(5, 10));
        System.out.println("add(5, 10, 15) = " + add(5, 10, 15));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));

        // ============================================
        // 5. PRACTICAL EXAMPLES
        // ============================================
        System.out.println("\n--- Practical Examples ---");

        // Check if number is even
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));

        // Calculate factorial
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 7: " + factorial(7));

        // Check if number is prime
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 20 prime? " + isPrime(20));

        // Convert temperature
        double celsius = 25.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
    }

    // ============================================
    // METHOD DEFINITIONS
    // ============================================

    // Void method - no return value
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Void method with parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that returns an int
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded add method - three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded add method - two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method that returns a double
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method to find maximum of two numbers
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // Or simply: return (a > b) ? a : b;
    }

    // Method with multiple parameters
    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;  // Use 3.0 for decimal division
    }

    // Void method with multiple parameters
    public static void printStudentInfo(String name, int age, double gpa) {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.printf("GPA: %.2f%n", gpa);
    }

    // Method that returns boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Recursive method - factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method to check if prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Temperature conversion method
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
