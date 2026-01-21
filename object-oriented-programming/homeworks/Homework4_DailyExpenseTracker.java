/**
 * HOMEWORK 4: Daily Expense Tracker (7-Day Analysis)
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 *
 * ============================================================
 * INSTRUCTIONS (READ CAREFULLY):
 * ============================================================
 *
 * Track YOUR REAL expenses for the PAST 7 DAYS.
 * This homework CANNOT be copied because it uses YOUR spending data.
 *
 * REQUIREMENTS:
 * 1. Track REAL expenses for 7 consecutive days (before submission)
 * 2. Include at least 3 expense categories per day
 * 3. Use realistic Tanzanian Shilling amounts
 * 4. Categories: Food, Transport, Airtime, Entertainment, Stationery, Other
 * 5. Include dates for each day tracked
 *
 * TASK:
 * Create a program that:
 * a) Stores 7 days of expense data using 2D arrays or ArrayList
 * b) Each day must have: date, category, amount, description
 * c) Calculates total spending per category
 * d) Calculates daily spending totals
 * e) Finds your highest spending day and category
 * f) Calculates daily average spending
 * g) Provides spending advice based on your patterns
 *
 * EXAMPLE OUTPUT FORMAT:
 * ================================================
 * 7-DAY EXPENSE REPORT
 * Student: [Your Name] - [Your Reg Number]
 * Period: [Start Date] to [End Date]
 * ================================================
 *
 * DAY 1 - [Date]:
 *   Food: TSh X,XXX (breakfast, lunch, etc.)
 *   Transport: TSh X,XXX (daladala, bajaji)
 *   ...
 *   Daily Total: TSh X,XXX
 *
 * [Continue for all 7 days...]
 *
 * ------------------------------------------------
 * CATEGORY SUMMARY:
 * Food:          TSh XX,XXX (XX%)
 * Transport:     TSh XX,XXX (XX%)
 * Airtime:       TSh XX,XXX (XX%)
 * Entertainment: TSh XX,XXX (XX%)
 * Stationery:    TSh XX,XXX (XX%)
 * Other:         TSh XX,XXX (XX%)
 * ------------------------------------------------
 * TOTAL 7-DAY SPENDING: TSh XX,XXX
 * Daily Average: TSh X,XXX
 * Highest Day: [Day] - TSh X,XXX
 * Highest Category: [Category] - TSh XX,XXX
 *
 * ADVICE: [Based on spending pattern]
 * ================================================
 *
 * GRADING CRITERIA:
 * - Correct 2D array/ArrayList usage (20%)
 * - Accurate calculations (25%)
 * - Proper percentage calculations (15%)
 * - Meaningful advice generation (10%)
 * - Use of YOUR real expense data (30%)
 *
 * WARNING: Unrealistic amounts or patterns will result in ZERO marks.
 * Be prepared to explain your spending in class.
 */

public class Homework4_DailyExpenseTracker {
    public static void main(String[] args) {
        // TODO: Implement your solution here

        // Step 1: Define expense categories
        String[] categories = {"Food", "Transport", "Airtime", "Entertainment", "Stationery", "Other"};

        // Step 2: Create 2D array for 7 days x 6 categories
        // double[][] expenses = new double[7][6];
        // String[] dates = new String[7];

        // Step 3: Fill in YOUR real expense data
        // dates[0] = "01/01/2025";
        // expenses[0][0] = 5000; // Day 1, Food
        // expenses[0][1] = 2000; // Day 1, Transport
        // ... continue for all days

        // Step 4: Calculate totals per category

        // Step 5: Calculate daily totals

        // Step 6: Find highest day and category

        // Step 7: Generate advice based on spending

        // Step 8: Display formatted report

        System.out.println("// DELETE THIS LINE AND IMPLEMENT YOUR SOLUTION");
    }

    // Method to generate spending advice
    public static String getAdvice(double[] categoryTotals, String[] categories) {
        // TODO: Analyze spending and return advice
        // Example: If food > 50% of total, suggest budgeting
        return "Advice here";
    }
}
