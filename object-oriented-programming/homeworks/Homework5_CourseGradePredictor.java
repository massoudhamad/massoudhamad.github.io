/**
 * HOMEWORK 5: Course Grade Predictor
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 *
 * ============================================================
 * INSTRUCTIONS (READ CAREFULLY):
 * ============================================================
 *
 * Create a grade predictor using YOUR REAL academic scores.
 * This homework CANNOT be copied because it uses YOUR grades.
 *
 * REQUIREMENTS:
 * 1. Use YOUR real courses from THIS SEMESTER
 * 2. Include at least 5 courses you are currently taking
 * 3. Use real test/quiz scores you have received so far
 * 4. Use SUZA grading scale (A, B+, B, C, D, E, F)
 *
 * TASK:
 * Create a program that:
 * a) Stores your current courses and their weights:
 *    - Coursework: 40% (Tests, Quizzes, Assignments)
 *    - Final Exam: 60%
 * b) For each course, input your current coursework marks
 * c) Calculates what final exam score you need for each grade
 * d) Predicts your final grade based on current performance
 * e) Shows which courses need more attention
 *
 * SUZA GRADING SCALE:
 * A:  70-100
 * B+: 60-69
 * B:  50-59
 * C:  40-49
 * D:  35-39
 * E:  30-34
 * F:  0-29
 *
 * EXAMPLE OUTPUT FORMAT:
 * ================================================
 * SEMESTER GRADE PREDICTION REPORT
 * Student: [Your Name]
 * Registration: [Your Reg Number]
 * Semester: [Current Semester]
 * ================================================
 *
 * COURSE: PT821 - Object-Oriented Programming
 * Current Coursework: XX/40 marks
 * Coursework Percentage: XX%
 *
 * To achieve grade A (70+): Need XX/60 in final exam
 * To achieve grade B+ (60+): Need XX/60 in final exam
 * To achieve grade B (50+): Need XX/60 in final exam
 *
 * Prediction: Based on coursework, likely grade is [X]
 * Status: [SAFE / AT RISK / NEEDS IMPROVEMENT]
 *
 * [Repeat for all courses...]
 *
 * ------------------------------------------------
 * OVERALL SEMESTER OUTLOOK:
 * Courses on track for A: X
 * Courses on track for B+: X
 * Courses needing attention: X
 *
 * Priority Focus: [Course with lowest prediction]
 * ================================================
 *
 * GRADING CRITERIA:
 * - Correct grade calculation logic (25%)
 * - Proper use of methods (20%)
 * - Accurate predictions (20%)
 * - Clear status indicators (5%)
 * - Use of YOUR real academic data (30%)
 *
 * WARNING: Academic records will be cross-checked.
 * Use only courses you are actually enrolled in.
 */

public class Homework5_CourseGradePredictor {
    public static void main(String[] args) {
        // TODO: Implement your solution here

        // Step 1: Define your courses
        // String[] courses = {"PT821", "PT822", ...};
        // String[] courseNames = {"Object-Oriented Programming", ...};

        // Step 2: Enter your current coursework scores (out of 40)
        // double[] courseworkScores = {XX, XX, ...};

        // Step 3: Calculate required final exam scores for each grade

        // Step 4: Predict likely grade based on coursework performance

        // Step 5: Identify courses needing attention

        // Step 6: Display comprehensive report

        System.out.println("// DELETE THIS LINE AND IMPLEMENT YOUR SOLUTION");
    }

    // Method to calculate required exam score for target grade
    public static double requiredExamScore(double coursework, double targetTotal) {
        // Formula: coursework + examScore = targetTotal
        // examScore = targetTotal - coursework
        // But examScore max is 60
        return Math.min(60, Math.max(0, targetTotal - coursework));
    }

    // Method to predict grade from coursework
    public static String predictGrade(double coursework) {
        // If coursework is X/40, assume similar performance in exam
        // TODO: Implement prediction logic
        return "?";
    }

    // Method to get grade letter from total marks
    public static String getGrade(double total) {
        if (total >= 70) return "A";
        else if (total >= 60) return "B+";
        else if (total >= 50) return "B";
        else if (total >= 40) return "C";
        else if (total >= 35) return "D";
        else if (total >= 30) return "E";
        else return "F";
    }
}
