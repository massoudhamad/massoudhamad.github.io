/**
 * EXERCISE 4: University Course Class
 * PT821: Object-Oriented Programming - Classes and Objects
 *
 * TASK: Complete the Course class for a university registration system
 *
 * Requirements:
 * 1. Add the following private attributes:
 *    - courseCode (String)
 *    - courseName (String)
 *    - instructorName (String)
 *    - creditHours (int)
 *    - maxCapacity (int)
 *    - enrolledStudents (int)
 *    - isActive (boolean)
 *
 * 2. Create constructors:
 *    - Default constructor
 *    - Parameterized constructor (courseCode, courseName, creditHours, maxCapacity)
 *    - Set enrolledStudents to 0 and isActive to true
 *
 * 3. Add getters for all attributes
 *
 * 4. Add setters with validation:
 *    - creditHours must be between 1 and 6
 *    - maxCapacity must be > 0
 *
 * 5. Add behavior methods:
 *    - assignInstructor(String name) - assigns instructor
 *    - enrollStudent() - enrolls a student if space available, returns true/false
 *    - dropStudent() - removes a student if any enrolled
 *    - getAvailableSeats() - returns remaining capacity
 *    - isFull() - returns true if course is at capacity
 *    - cancelCourse() - sets isActive to false if no students enrolled
 *    - displayCourseInfo() - shows all course details
 *
 * 6. Test your class with at least 2 courses
 */
public class Exercise4_Course {

    // TODO: Add private attributes here


    // TODO: Add default constructor


    // TODO: Add parameterized constructor


    // TODO: Add getters


    // TODO: Add setters with validation


    // TODO: Add assignInstructor() method


    // TODO: Add enrollStudent() method


    // TODO: Add dropStudent() method


    // TODO: Add getAvailableSeats() method


    // TODO: Add isFull() method


    // TODO: Add cancelCourse() method


    // TODO: Add displayCourseInfo() method


    public static void main(String[] args) {
        System.out.println("=== University Course Exercise ===\n");

        // TODO: Create course1 - "PT821", "Object-Oriented Programming", 3, 40


        // TODO: Create course2 - "PT822", "Database Systems", 3, 35


        // TODO: Assign instructors to both courses


        // TODO: Enroll 38 students in course1 (use a loop)


        // TODO: Display course1 info


        // TODO: Check available seats in course1


        // TODO: Try to enroll 5 more students in course1


        // TODO: Check if course1 is full


        // TODO: Drop 3 students from course1


        // TODO: Display final info for both courses


        System.out.println("\n=== Exercise Complete ===");
    }
}
