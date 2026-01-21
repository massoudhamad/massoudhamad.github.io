import java.util.Scanner;

/**
 * Exercise 7: Grade Calculator
 * PT821 - Object-Oriented Programming
 *
 * TASK:
 * Create a program that:
 * 1. Asks the user for their exam score (0-100)
 * 2. Validates the input (must be between 0 and 100)
 * 3. Determines the grade using this scale:
 *    - 90-100: A (Excellent)
 *    - 80-89:  B (Very Good)
 *    - 70-79:  C (Good)
 *    - 60-69:  D (Satisfactory)
 *    - 50-59:  E (Pass)
 *    - Below 50: F (Fail)
 * 4. Displays whether the student passed or failed
 *
 * CONCEPTS PRACTICED:
 * - if-else if-else statements
 * - Input validation
 * - Comparison operators
 * - Logical operators
 */
public class Exercise7_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===\n");

        // Get score from user
        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        // Validate input
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100!");
        } else {
            // Determine grade
            char grade;
            String description;

            if (score >= 90) {
                grade = 'A';
                description = "Excellent";
            } else if (score >= 80) {
                grade = 'B';
                description = "Very Good";
            } else if (score >= 70) {
                grade = 'C';
                description = "Good";
            } else if (score >= 60) {
                grade = 'D';
                description = "Satisfactory";
            } else if (score >= 50) {
                grade = 'E';
                description = "Pass";
            } else {
                grade = 'F';
                description = "Fail";
            }

            // Display results
            System.out.println("\n--- Results ---");
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade + " (" + description + ")");

            // Pass/Fail status
            if (score >= 50) {
                System.out.println("Status: PASSED! Congratulations!");
            } else {
                System.out.println("Status: FAILED. Please try again.");
            }
        }

        scanner.close();
    }
}

/*
 * SAMPLE OUTPUT:
 * =============
 *
 * === Grade Calculator ===
 *
 * Enter your exam score (0-100): 75
 *
 * --- Results ---
 * Score: 75
 * Grade: C (Good)
 * Status: PASSED! Congratulations!
 *
 * EXTENSION CHALLENGE:
 * - Add support for multiple subjects
 * - Calculate the average of all subjects
 * - Determine overall grade based on average
 */
