import java.util.Scanner;

/**
 * Java Basics: Conditional Statements
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - if statement
 * - if-else statement
 * - if-else if-else ladder
 * - switch-case statement
 * - Ternary operator
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ============================================
        // 1. SIMPLE IF STATEMENT
        // ============================================
        System.out.println("=== Simple if Statement ===\n");

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        int temperature = 35;

        if (temperature > 30) {
            System.out.println("It's hot today!");
            System.out.println("Stay hydrated.");
        }

        // ============================================
        // 2. IF-ELSE STATEMENT
        // ============================================
        System.out.println("\n=== if-else Statement ===\n");

        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Voting eligibility
        int voterAge = 16;

        if (voterAge >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote yet.");
            System.out.println("Wait " + (18 - voterAge) + " more years.");
        }

        // ============================================
        // 3. IF-ELSE IF-ELSE LADDER
        // ============================================
        System.out.println("\n=== if-else if-else Ladder ===\n");

        // Grade calculation
        int score = 75;

        System.out.println("Score: " + score);

        if (score >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (score >= 80) {
            System.out.println("Grade: B (Very Good)");
        } else if (score >= 70) {
            System.out.println("Grade: C (Good)");
        } else if (score >= 60) {
            System.out.println("Grade: D (Satisfactory)");
        } else if (score >= 50) {
            System.out.println("Grade: E (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Day of week
        int day = 3;

        System.out.println("\nDay number: " + day);

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }

        // ============================================
        // 4. NESTED IF STATEMENTS
        // ============================================
        System.out.println("\n=== Nested if Statements ===\n");

        int studentAge = 22;
        boolean hasID = true;

        if (studentAge >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("Please show your ID.");
            }
        } else {
            System.out.println("Entry not allowed. Must be 18+");
        }

        // ============================================
        // 5. SWITCH-CASE STATEMENT
        // ============================================
        System.out.println("\n=== switch-case Statement ===\n");

        // Basic switch
        int dayNumber = 5;

        System.out.println("Day number: " + dayNumber);

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch with String (Java 7+)
        String month = "March";

        System.out.println("\nMonth: " + month);

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("Q1 - First Quarter");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Q2 - Second Quarter");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Q3 - Third Quarter");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Q4 - Fourth Quarter");
                break;
            default:
                System.out.println("Invalid month");
        }

        // Switch for calculator
        System.out.println("\n--- Simple Calculator with Switch ---");
        int num1 = 20;
        int num2 = 5;
        char operator = '/';

        System.out.println("Expression: " + num1 + " " + operator + " " + num2);

        switch (operator) {
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
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        // ============================================
        // 6. TERNARY OPERATOR
        // ============================================
        System.out.println("\n=== Ternary Operator ===\n");

        // Syntax: condition ? valueIfTrue : valueIfFalse

        int x = 10;
        int y = 20;

        // Using if-else
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println("Max (if-else): " + max);

        // Using ternary operator
        int maxTernary = (x > y) ? x : y;
        System.out.println("Max (ternary): " + maxTernary);

        // More examples
        int num = 15;
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);

        int testScore = 75;
        String result = (testScore >= 50) ? "PASS" : "FAIL";
        System.out.println("Score " + testScore + ": " + result);

        scanner.close();
    }
}
