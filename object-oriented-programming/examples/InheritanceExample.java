/**
 * Inheritance Example - Object-Oriented Programming
 * PT821 - State University of Zanzibar (SUZA)
 *
 * This example demonstrates:
 * - Single inheritance using 'extends' keyword
 * - The 'super' keyword for accessing parent class
 * - Method inheritance and overriding
 * - Constructor chaining
 */

// Parent class (Superclass)
class Person {
    protected String name;
    protected int age;

    // Parent constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    // Parent method
    public void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class (Subclass) - inherits from Person
class Student extends Person {
    private String studentId;
    private String major;

    // Child constructor - calls parent constructor using super()
    public Student(String name, int age, String studentId, String major) {
        super(name, age);  // MUST be first statement
        this.studentId = studentId;
        this.major = major;
        System.out.println("Student constructor called");
    }

    // New method specific to Student
    public void study() {
        System.out.println(name + " is studying " + major);
    }

    // Overriding parent method
    @Override
    public void introduce() {
        super.introduce();  // Call parent's introduce first
        System.out.println("I am a student with ID: " + studentId);
        System.out.println("My major is: " + major);
    }

    // Getter methods
    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }
}

// Another child class - Multilevel inheritance
class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisor;

    public GraduateStudent(String name, int age, String studentId,
                          String major, String researchTopic, String supervisor) {
        super(name, age, studentId, major);
        this.researchTopic = researchTopic;
        this.supervisor = supervisor;
        System.out.println("GraduateStudent constructor called");
    }

    public void doResearch() {
        System.out.println(name + " is researching: " + researchTopic);
        System.out.println("Supervisor: " + supervisor);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a graduate student researching " + researchTopic);
    }
}

// Hierarchical inheritance - Teacher also extends Person
class Teacher extends Person {
    private String employeeId;
    private String department;
    private double salary;

    public Teacher(String name, int age, String employeeId,
                  String department, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        System.out.println("Teacher constructor called");
    }

    public void teach() {
        System.out.println(name + " is teaching in " + department + " department");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a teacher in the " + department + " department");
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE EXAMPLE ===\n");

        // 1. Creating a Person object
        System.out.println("--- Creating Person ---");
        Person person = new Person("Ali Hassan", 30);
        person.introduce();
        person.sleep();

        System.out.println("\n--- Creating Student ---");
        // 2. Creating a Student object (Single Inheritance)
        Student student = new Student("Fatma Said", 20, "CS2024001", "Computer Science");
        student.introduce();
        student.study();
        student.sleep();  // Inherited method

        System.out.println("\n--- Creating Graduate Student ---");
        // 3. Creating a GraduateStudent object (Multilevel Inheritance)
        GraduateStudent gradStudent = new GraduateStudent(
            "Omar Juma", 25, "PG2024001", "Computer Science",
            "Machine Learning in Agriculture", "Dr. Amina Khamis"
        );
        gradStudent.introduce();
        gradStudent.study();      // Inherited from Student
        gradStudent.doResearch(); // Own method
        gradStudent.sleep();      // Inherited from Person

        System.out.println("\n--- Creating Teacher ---");
        // 4. Creating a Teacher object (Hierarchical Inheritance)
        Teacher teacher = new Teacher("Dr. Mwanaisha Ali", 45, "T2020001",
                                     "Computer Science", 2500000.0);
        teacher.introduce();
        teacher.teach();
        teacher.sleep();  // Inherited method

        System.out.println("\n=== DEMONSTRATING INHERITANCE HIERARCHY ===");
        // 5. Demonstrating 'is-a' relationship
        System.out.println("\nIs student a Person? " + (student instanceof Person));
        System.out.println("Is gradStudent a Student? " + (gradStudent instanceof Student));
        System.out.println("Is gradStudent a Person? " + (gradStudent instanceof Person));
        System.out.println("Is teacher a Person? " + (teacher instanceof Person));
        System.out.println("Is teacher a Student? " + (teacher instanceof Student));
    }
}

/*
 * OUTPUT:
 * === INHERITANCE EXAMPLE ===
 *
 * --- Creating Person ---
 * Person constructor called
 * Hi, I am Ali Hassan and I am 30 years old.
 * Ali Hassan is sleeping...
 *
 * --- Creating Student ---
 * Person constructor called
 * Student constructor called
 * Hi, I am Fatma Said and I am 20 years old.
 * I am a student with ID: CS2024001
 * My major is: Computer Science
 * Fatma Said is studying Computer Science
 * Fatma Said is sleeping...
 *
 * ... (more output)
 *
 * COMPILE: javac InheritanceExample.java
 * RUN: java InheritanceExample
 */
