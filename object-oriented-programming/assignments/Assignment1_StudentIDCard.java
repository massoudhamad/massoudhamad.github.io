/**
 * ASSIGNMENT 1: Digital Student ID Card System
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 * Total Marks: 100
 *
 * ============================================================
 * ASSIGNMENT OVERVIEW:
 * ============================================================
 *
 * Create a complete Student ID Card management system using OOP principles.
 * This assignment tests your understanding of Classes, Objects, Encapsulation,
 * and Methods.
 *
 * YOU MUST USE YOUR REAL STUDENT INFORMATION.
 *
 * ============================================================
 * REQUIREMENTS:
 * ============================================================
 *
 * PART A: Student Class (40 marks)
 * Create a Student class with:
 * 1. Private attributes:
 *    - registrationNumber (String)
 *    - fullName (String)
 *    - program (String) - e.g., "BITA"
 *    - yearOfStudy (int)
 *    - dateOfBirth (String)
 *    - gender (String)
 *    - nationality (String)
 *    - phoneNumber (String)
 *    - emailAddress (String)
 *    - photoPath (String) - path to photo file
 *
 * 2. Constructor that initializes all attributes
 *
 * 3. Getter and Setter methods for ALL attributes
 *
 * 4. A method generateIDNumber() that creates a unique ID:
 *    Format: SUZA-[Program]-[Year]-[Last4DigitsOfReg]
 *    Example: SUZA-BITA-2-0045
 *
 * 5. A method calculateExpiryDate() that returns:
 *    - 4 years from enrollment for undergraduate
 *    - 2 years from enrollment for diploma
 *
 * 6. A toString() method that returns formatted ID card info
 *
 * PART B: IDCardPrinter Class (30 marks)
 * Create a class that:
 * 1. Takes a Student object
 * 2. Generates a text-based ID card display:
 *
 *    ╔══════════════════════════════════════════╗
 *    ║     STATE UNIVERSITY OF ZANZIBAR         ║
 *    ║            STUDENT ID CARD               ║
 *    ╠══════════════════════════════════════════╣
 *    ║  [PHOTO]   Name: [Full Name]             ║
 *    ║            Reg: [Registration Number]    ║
 *    ║            Program: [Program Name]       ║
 *    ║            Year: [Year of Study]         ║
 *    ║            ID: [Generated ID]            ║
 *    ╠══════════════════════════════════════════╣
 *    ║  Valid Until: [Expiry Date]              ║
 *    ╚══════════════════════════════════════════╝
 *
 * 3. Validates that all required fields are filled
 * 4. Checks if the student is still active (not expired)
 *
 * PART C: Main Application (30 marks)
 * Create a main class that:
 * 1. Creates YOUR Student object with YOUR real information
 * 2. Creates at least 2 more students (classmates - get their permission)
 * 3. Stores all students in an ArrayList
 * 4. Provides a menu:
 *    a) Display all ID cards
 *    b) Search student by registration number
 *    c) Search student by name
 *    d) Display expired/active status
 *    e) Exit
 *
 * ============================================================
 * SUBMISSION REQUIREMENTS:
 * ============================================================
 * - Student.java (the class file)
 * - IDCardPrinter.java (the printer class)
 * - StudentIDSystem.java (main application)
 * - Screenshot of program running with YOUR information
 * - Brief report explaining your design decisions (1 page max)
 *
 * ============================================================
 * GRADING RUBRIC:
 * ============================================================
 * - Correct class design and encapsulation: 25 marks
 * - Working getter/setter methods: 15 marks
 * - ID generation and expiry calculation: 15 marks
 * - ID card display formatting: 15 marks
 * - Menu functionality and ArrayList usage: 15 marks
 * - Use of YOUR real information: 15 marks
 *
 * PLAGIARISM WARNING: Each student's output will be unique.
 * Copied code with different names will be flagged automatically.
 */

public class Assignment1_StudentIDCard {
    public static void main(String[] args) {
        System.out.println("Create separate files as specified in the requirements.");
        System.out.println("This file is just for instructions.");

        // Your implementation should be in separate class files:
        // 1. Student.java
        // 2. IDCardPrinter.java
        // 3. StudentIDSystem.java (main)
    }
}

// HINT: Start with this Student class structure
/*
class Student {
    // Private attributes
    private String registrationNumber;
    private String fullName;
    // ... add all other attributes

    // Constructor
    public Student(String regNumber, String name, ...) {
        this.registrationNumber = regNumber;
        this.fullName = name;
        // ... initialize all attributes
    }

    // Getters and Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String regNumber) {
        this.registrationNumber = regNumber;
    }

    // ... add getters/setters for all attributes

    // Generate unique ID
    public String generateIDNumber() {
        // Extract program, year, and last 4 digits
        // Return formatted ID
    }

    // Calculate expiry date
    public String calculateExpiryDate() {
        // Calculate based on program type
    }

    @Override
    public String toString() {
        // Return formatted string
    }
}
*/
