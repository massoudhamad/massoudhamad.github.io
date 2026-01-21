/**
 * HOMEWORK 3: Phone Contact Manager
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 *
 * ============================================================
 * INSTRUCTIONS (READ CAREFULLY):
 * ============================================================
 *
 * Create a contact manager using YOUR REAL phone contacts.
 * This homework CANNOT be copied because it uses YOUR contacts.
 *
 * REQUIREMENTS:
 * 1. Use at least 10 REAL contacts from your phone
 * 2. Use REAL Tanzanian phone numbers (07XX or 06XX format)
 * 3. Categorize contacts into groups (Family, Friends, Classmates, Others)
 * 4. Your OWN number must be included
 *
 * TASK:
 * Create a program that:
 * a) Stores 10+ contacts using ArrayList (name, phone, category)
 * b) Displays all contacts sorted by category
 * c) Counts contacts per category
 * d) Searches for a contact by name (partial match)
 * e) Identifies which network provider each contact uses:
 *    - Vodacom: 074, 075, 076
 *    - Airtel: 078, 079, 068, 069
 *    - Tigo: 071, 065, 067
 *    - Halotel: 062
 *    - TTCL: 073
 * f) Shows which provider has most of your contacts
 *
 * EXAMPLE OUTPUT FORMAT:
 * ================================================
 * MY PHONE CONTACTS ANALYSIS
 * Owner: [Your Name] - [Your Reg Number]
 * My Number: 07XX XXX XXX ([Provider])
 * ================================================
 *
 * FAMILY CONTACTS (X):
 * - [Name]: 07XXXXXXXX ([Provider])
 * ...
 *
 * FRIENDS CONTACTS (X):
 * - [Name]: 07XXXXXXXX ([Provider])
 * ...
 *
 * ------------------------------------------------
 * NETWORK ANALYSIS:
 * Vodacom contacts: X
 * Airtel contacts: X
 * Tigo contacts: X
 * Others: X
 *
 * Most used network: [Provider] (X contacts)
 * ================================================
 *
 * GRADING CRITERIA:
 * - Correct ArrayList usage (25%)
 * - Proper categorization logic (20%)
 * - Network detection algorithm (25%)
 * - Use of YOUR real contacts (30%)
 *
 * WARNING: Random/fake numbers will be detected and result in ZERO marks.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Homework3_PhoneContactManager {
    public static void main(String[] args) {
        // TODO: Implement your solution here

        // Step 1: Create ArrayLists for contacts
        // ArrayList<String> names = new ArrayList<>();
        // ArrayList<String> phones = new ArrayList<>();
        // ArrayList<String> categories = new ArrayList<>();

        // Step 2: Add your real contacts
        // names.add("Contact Name");
        // phones.add("07XXXXXXXX");
        // categories.add("Family"); // or Friends, Classmates, Others

        // Step 3: Create method to detect network provider
        // Hint: Use phone.startsWith("074") etc.

        // Step 4: Display contacts by category

        // Step 5: Analyze and display network statistics

        System.out.println("// DELETE THIS LINE AND IMPLEMENT YOUR SOLUTION");
    }

    // Create a method to get network provider from phone number
    public static String getProvider(String phone) {
        // TODO: Implement network detection logic
        return "Unknown";
    }
}
