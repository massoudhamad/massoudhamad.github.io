/**
 * ASSIGNMENT 4: University Timetable Management System
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 * Total Marks: 100
 *
 * ============================================================
 * ASSIGNMENT OVERVIEW:
 * ============================================================
 *
 * Create a timetable management system using YOUR ACTUAL CLASS SCHEDULE.
 * This assignment tests inheritance, polymorphism, and complex OOP design.
 *
 * YOU MUST USE YOUR REAL SEMESTER TIMETABLE.
 *
 * ============================================================
 * REQUIREMENTS:
 * ============================================================
 *
 * PART A: Class Hierarchy (30 marks)
 *
 * 1. Abstract Class: ScheduleItem
 *    - courseCode (String)
 *    - courseName (String)
 *    - instructor (String)
 *    - venue (String)
 *    - dayOfWeek (String)
 *    - startTime (String)
 *    - endTime (String)
 *    - abstract method: getDuration()
 *    - abstract method: getItemType()
 *
 * 2. Class: Lecture extends ScheduleItem
 *    - Additional: lectureNumber (int), isCompulsory (boolean)
 *    - Implements getDuration() and getItemType()
 *
 * 3. Class: Lab extends ScheduleItem
 *    - Additional: labNumber (int), requiredSoftware (String)
 *    - Implements getDuration() and getItemType()
 *
 * 4. Class: Tutorial extends ScheduleItem
 *    - Additional: tutorialGroup (String), maxStudents (int)
 *    - Implements getDuration() and getItemType()
 *
 * PART B: Timetable Class (25 marks)
 * Create a Timetable class:
 * 1. Attributes:
 *    - studentName (String)
 *    - registrationNumber (String)
 *    - semester (String)
 *    - program (String)
 *    - schedule (ArrayList<ScheduleItem>)
 *
 * 2. Methods:
 *    - addItem(ScheduleItem item)
 *    - getItemsForDay(String day)
 *    - getTotalHoursPerWeek()
 *    - checkConflicts() - returns any overlapping classes
 *    - getNextClass() - based on current day/time
 *    - displayWeeklySchedule()
 *    - displayDailySchedule(String day)
 *
 * PART C: Timetable Display (25 marks)
 * Create a formatted weekly timetable:
 *
 *    ╔═══════════════════════════════════════════════════════════════════════════╗
 *    ║                    WEEKLY TIMETABLE - SEMESTER [X]                        ║
 *    ║    Student: [Your Name]     Reg: [Your Reg]     Program: BITA Year 2     ║
 *    ╠═══════════════════════════════════════════════════════════════════════════╣
 *    ║   TIME    │  MONDAY   │  TUESDAY  │ WEDNESDAY │ THURSDAY  │  FRIDAY     ║
 *    ╠═══════════════════════════════════════════════════════════════════════════╣
 *    ║ 08:00-10:00│  PT821    │           │   PT823   │   PT821   │            ║
 *    ║           │  Lecture  │           │   Lab     │   Lecture │            ║
 *    ║           │  Room 101 │           │   Lab 2   │   Room 101│            ║
 *    ╠═══════════════════════════════════════════════════════════════════════════╣
 *    ║ 10:00-12:00│           │  PT822    │           │   PT824   │   PT825    ║
 *    ║           │           │  Lecture  │           │   Lecture │   Tutorial ║
 *    ║           │           │  Room 203 │           │   Room 105│   Room 108 ║
 *    ╠═══════════════════════════════════════════════════════════════════════════╣
 *    ║   ...continue for all time slots...                                       ║
 *    ╚═══════════════════════════════════════════════════════════════════════════╝
 *
 * PART D: Personal Timetable (20 marks)
 * 1. Enter YOUR complete weekly timetable
 * 2. Include ALL courses you're taking this semester
 * 3. Use REAL room numbers and instructor names
 * 4. Include actual class times
 * 5. Demonstrate polymorphism by mixing Lecture, Lab, and Tutorial objects
 *
 * ============================================================
 * ADDITIONAL FEATURES (Bonus - up to 10 marks):
 * ============================================================
 * - Color-coded output (different colors for Lecture/Lab/Tutorial)
 * - Export timetable to text file
 * - Calculate free time slots
 * - Reminder for next class
 *
 * ============================================================
 * SUBMISSION:
 * ============================================================
 * - ScheduleItem.java (abstract class)
 * - Lecture.java
 * - Lab.java
 * - Tutorial.java
 * - Timetable.java
 * - TimetableApp.java (main)
 * - Screenshot of YOUR actual timetable from university
 * - Program output showing YOUR schedule
 *
 * VERIFICATION: Timetable will be cross-checked with university records.
 */

public class Assignment4_UniversityTimetable {
    public static void main(String[] args) {
        System.out.println("Create the timetable system using YOUR actual class schedule.");
        System.out.println("Demonstrates: Inheritance, Polymorphism, Abstract Classes");
    }
}

// HINT: Abstract class structure
/*
abstract class ScheduleItem {
    protected String courseCode;
    protected String courseName;
    protected String instructor;
    protected String venue;
    protected String dayOfWeek;
    protected String startTime;
    protected String endTime;

    // Constructor
    public ScheduleItem(String code, String name, String instructor,
                        String venue, String day, String start, String end) {
        // Initialize all attributes
    }

    // Abstract methods - must be implemented by subclasses
    public abstract int getDuration(); // in minutes
    public abstract String getItemType(); // "Lecture", "Lab", or "Tutorial"

    // Concrete methods
    public boolean conflictsWith(ScheduleItem other) {
        // Check if this item overlaps with another
        // Same day and overlapping times = conflict
    }

    // Getters and setters...
}

class Lecture extends ScheduleItem {
    private int lectureNumber;
    private boolean isCompulsory;

    public Lecture(...) {
        super(...);
        // Initialize lecture-specific attributes
    }

    @Override
    public int getDuration() {
        // Calculate duration from start and end time
    }

    @Override
    public String getItemType() {
        return "Lecture";
    }
}

// Similar for Lab and Tutorial classes
*/
