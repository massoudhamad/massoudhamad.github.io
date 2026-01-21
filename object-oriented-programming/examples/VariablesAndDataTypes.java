/**
 * Java Basics: Variables and Data Types
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - Primitive data types (int, double, float, char, boolean, byte, short, long)
 * - Reference types (String)
 * - Variable declaration and initialization
 * - Type casting
 */
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // ============================================
        // 1. PRIMITIVE DATA TYPES
        // ============================================

        // Integer types
        byte smallNumber = 127;              // 8-bit: -128 to 127
        short mediumNumber = 32000;          // 16-bit: -32,768 to 32,767
        int number = 2000000;                // 32-bit: most commonly used
        long bigNumber = 9000000000L;        // 64-bit: note the 'L' suffix

        // Floating-point types
        float decimal = 3.14f;               // 32-bit: note the 'f' suffix
        double preciseDecimal = 3.14159265;  // 64-bit: more precision

        // Character type
        char letter = 'A';                   // Single character in single quotes
        char unicodeChar = '\u0041';         // Unicode representation of 'A'

        // Boolean type
        boolean isJavaFun = true;            // true or false only
        boolean isRaining = false;

        // ============================================
        // 2. REFERENCE TYPES (Objects)
        // ============================================

        // String - sequence of characters (double quotes)
        String name = "Zanzibar";
        String greeting = "Jambo!";

        // ============================================
        // 3. DISPLAYING VARIABLES
        // ============================================

        System.out.println("=== Integer Types ===");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + bigNumber);

        System.out.println("\n=== Floating-Point Types ===");
        System.out.println("float: " + decimal);
        System.out.println("double: " + preciseDecimal);

        System.out.println("\n=== Character Type ===");
        System.out.println("char: " + letter);
        System.out.println("unicode char: " + unicodeChar);

        System.out.println("\n=== Boolean Type ===");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is it raining? " + isRaining);

        System.out.println("\n=== String Type ===");
        System.out.println("Name: " + name);
        System.out.println("Greeting: " + greeting);

        // ============================================
        // 4. TYPE CASTING
        // ============================================

        System.out.println("\n=== Type Casting ===");

        // Implicit casting (widening) - automatic
        int myInt = 100;
        double myDouble = myInt;  // int to double automatically
        System.out.println("Implicit: int " + myInt + " to double " + myDouble);

        // Explicit casting (narrowing) - manual
        double pi = 3.14159;
        int piInteger = (int) pi;  // double to int, loses decimal part
        System.out.println("Explicit: double " + pi + " to int " + piInteger);

        // String to number conversion
        String numberString = "42";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("Parsed string \"42\" to int: " + parsedNumber);

        // Number to String conversion
        int age = 25;
        String ageString = String.valueOf(age);
        System.out.println("Converted int 25 to String: \"" + ageString + "\"");
    }
}
