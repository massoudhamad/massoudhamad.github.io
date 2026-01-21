/**
 * StudentExample.java - Complete example of a Java class
 * PT821: Object-Oriented Programming
 * Lecture 3: Classes and Objects
 *
 * This class demonstrates:
 * - Attributes (instance variables)
 * - Constructors (default, parameterized, copy)
 * - Getters and Setters with validation
 * - Methods (behaviors)
 * - Encapsulation
 */
public class StudentExample {
    // ============================================
    // ATTRIBUTES (Private for Encapsulation)
    // ============================================
    private String studentId;
    private String name;
    private String email;
    private int age;
    private double gpa;

    // ============================================
    // CONSTRUCTORS
    // ============================================

    /**
     * Default Constructor
     * Creates a student with default values
     */
    public StudentExample() {
        this.studentId = "UNKNOWN";
        this.name = "Unknown Student";
        this.email = "";
        this.age = 0;
        this.gpa = 0.0;
    }

    /**
     * Parameterized Constructor
     * Creates a student with specified values
     * @param studentId The unique student ID
     * @param name The student's full name
     * @param age The student's age
     */
    public StudentExample(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = "";
        this.gpa = 0.0;
    }

    /**
     * Full Parameterized Constructor
     * Creates a student with all values specified
     */
    public StudentExample(String studentId, String name, String email, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gpa = gpa;
    }

    /**
     * Copy Constructor
     * Creates a new student by copying another student's data
     * @param other The student to copy
     */
    public StudentExample(StudentExample other) {
        this.studentId = other.studentId;
        this.name = other.name;
        this.email = other.email;
        this.age = other.age;
        this.gpa = other.gpa;
    }

    // ============================================
    // GETTERS (Accessor Methods)
    // ============================================

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // ============================================
    // SETTERS (Mutator Methods) with Validation
    // ============================================

    /**
     * Sets the student's name
     * @param name The new name (must not be null or empty)
     */
    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    /**
     * Sets the student's email
     * @param email The email address (basic validation for @ symbol)
     */
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format!");
        }
    }

    /**
     * Sets the student's age
     * @param age The age (must be between 16 and 100)
     */
    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 16 and 100!");
        }
    }

    /**
     * Sets the student's GPA
     * @param gpa The GPA (must be between 0.0 and 4.0)
     */
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0!");
        }
    }

    // ============================================
    // BEHAVIOR METHODS
    // ============================================

    /**
     * Simulates the student studying a subject
     * @param subject The subject being studied
     */
    public void study(String subject) {
        System.out.println(name + " is studying " + subject);
    }

    /**
     * Simulates the student attending a class
     * @param courseName The name of the course
     */
    public void attendClass(String courseName) {
        System.out.println(name + " is attending " + courseName);
    }

    /**
     * Simulates the student taking an exam
     * @param examName The name of the exam
     * @param score The score achieved (0-100)
     */
    public void takeExam(String examName, int score) {
        System.out.println(name + " took " + examName + " and scored " + score + "%");
        if (score >= 70) {
            System.out.println("Congratulations! You passed!");
        } else if (score >= 50) {
            System.out.println("You passed, but you can do better!");
        } else {
            System.out.println("You need to study harder!");
        }
    }

    /**
     * Checks if the student is on the Dean's List
     * @return true if GPA is 3.5 or higher
     */
    public boolean isOnDeansList() {
        return gpa >= 3.5;
    }

    /**
     * Displays all student information
     */
    public void displayInfo() {
        System.out.println("=============================");
        System.out.println("    STUDENT INFORMATION     ");
        System.out.println("=============================");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name:       " + name);
        System.out.println("Email:      " + email);
        System.out.println("Age:        " + age);
        System.out.println("GPA:        " + gpa);
        System.out.println("Dean's List: " + (isOnDeansList() ? "Yes" : "No"));
        System.out.println("=============================");
    }

    /**
     * Returns a string representation of the student
     * @return String representation
     */
    public String toString() {
        return "StudentExample[" + studentId + ": " + name + ", GPA: " + gpa + "]";
    }

    // ============================================
    // MAIN METHOD FOR TESTING
    // ============================================
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("  STUDENT CLASS DEMONSTRATION");
        System.out.println("====================================\n");

        // Creating objects using different constructors
        System.out.println("--- Creating Students ---\n");

        StudentExample student1 = new StudentExample();
        System.out.println("Created student1 using default constructor");

        StudentExample student2 = new StudentExample("BITA001", "Ali Hassan", 20);
        System.out.println("Created student2: " + student2.getName());

        StudentExample student3 = new StudentExample("BITA002", "Fatma Said", "fatma@suza.ac.tz", 21, 3.8);
        System.out.println("Created student3: " + student3.getName());

        // Using setters
        System.out.println("\n--- Modifying Student Data ---\n");
        student1.setName("Hassan Omar");
        student1.setAge(22);
        student1.setEmail("hassan@suza.ac.tz");
        student1.setGpa(3.2);
        student2.setGpa(3.5);

        // Using getters
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 GPA: " + student2.getGpa());

        // Calling behavior methods
        System.out.println("\n--- Student Activities ---\n");
        student2.study("Object-Oriented Programming");
        student3.attendClass("PT821");
        student2.takeExam("Midterm", 85);

        // Display information
        System.out.println("\n--- Full Information ---\n");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();

        // Using toString()
        System.out.println("\n--- Using toString() ---\n");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("\n====================================");
        System.out.println("  DEMONSTRATION COMPLETE!");
        System.out.println("====================================");
    }
}
