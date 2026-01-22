/**
 * Exercise 16: Combined OOP Concepts - University Management System
 * PT821 - Object-Oriented Programming
 * State University of Zanzibar (SUZA)
 *
 * INSTRUCTIONS:
 * This comprehensive exercise combines all OOP concepts:
 * - Inheritance
 * - Polymorphism (Overloading & Overriding)
 * - Abstract Classes
 * - Interfaces
 *
 * Follow the TODO comments and implement the required functionality.
 */

// ============================================
// INTERFACES
// ============================================

/*
 * TODO 1: Create interface "Enrollable" with:
 * - void enroll(String courseCode)
 * - void drop(String courseCode)
 * - String[] getEnrolledCourses()
 * - int getCourseCount()
 */

// Write your Enrollable interface here:


/*
 * TODO 2: Create interface "Gradeable" with:
 * - void addGrade(String courseCode, double grade)
 * - double getGrade(String courseCode)
 * - double calculateGPA()
 * - String getAcademicStanding()  // e.g., "Good Standing", "Probation"
 */

// Write your Gradeable interface here:


/*
 * TODO 3: Create interface "Payable" with:
 * - double calculatePay()
 * - void processPayment()
 * - String getPaymentDetails()
 */

// Write your Payable interface here:


// ============================================
// ABSTRACT CLASSES
// ============================================

/*
 * TODO 4: Create abstract class "Person" with:
 * - Protected: id, name, email, phone, dateOfBirth
 * - Constructor to initialize all fields
 * - Abstract method: getRole() - returns role as String
 * - Concrete method: displayBasicInfo()
 * - Concrete method: updateContact(String email, String phone)
 */

// Write your Person abstract class here:


/*
 * TODO 5: Create abstract class "UniversityMember" extending Person with:
 * - Protected: department, joinDate
 * - Constructor calling super() and initializing its fields
 * - Abstract method: getPrivileges() - returns String[]
 * - Concrete method: displayMemberInfo()
 */

// Write your UniversityMember abstract class here:


// ============================================
// CONCRETE CLASSES
// ============================================

/*
 * TODO 6: Create class "Student" extending UniversityMember, implementing Enrollable, Gradeable:
 * - Private: studentId, program, year, courses[], grades (use arrays or simple structure)
 * - Implement all abstract and interface methods
 * - Method: promoteToNextYear()
 * - Override getRole() to return "Student"
 * - Override getPrivileges() to return student privileges
 */

// Write your Student class here:


/*
 * TODO 7: Create class "Professor" extending UniversityMember, implementing Payable:
 * - Private: professorId, rank (Assistant/Associate/Full), salary, coursesTaught[]
 * - Implement all abstract and interface methods
 * - Method: assignCourse(String courseCode)
 * - Method: removeCourse(String courseCode)
 * - Override getRole() to return "Professor"
 * - Override calculatePay() based on rank and courses
 */

// Write your Professor class here:


/*
 * TODO 8: Create class "TeachingAssistant" extending UniversityMember, implementing Enrollable, Gradeable, Payable:
 * - This is both a student and an employee!
 * - Private: taId, hourlyRate, hoursWorked, supervisingProfessor
 * - Implement all interface methods
 * - Override getRole() to return "Teaching Assistant"
 * - Override calculatePay() based on hours worked
 */

// Write your TeachingAssistant class here:


/*
 * TODO 9: Create class "Course" with:
 * - Private: courseCode, courseName, credits, instructor (Professor), maxStudents
 * - Private: enrolledStudents[] array
 * - Method: addStudent(Student s) - checks capacity
 * - Method: removeStudent(String studentId)
 * - Method: getEnrollmentCount()
 * - Method: isFull()
 * - Method: displayCourseInfo()
 */

// Write your Course class here:


/*
 * TODO 10: Create class "University" with:
 * - Private: name, members (UniversityMember[]), courses (Course[])
 * - Method: addMember(UniversityMember m)
 * - Method: addCourse(Course c)
 * - Method: findMemberById(String id) - returns UniversityMember
 * - Method: findCourseByCode(String code) - returns Course
 * - Method: getAllStudents() - returns Student[]
 * - Method: getAllProfessors() - returns Professor[]
 * - Method: getTotalPayroll() - calculates total using Payable interface
 * - Method: displayStatistics()
 */

// Write your University class here:


public class Exercise16_CombinedOOP {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("    UNIVERSITY MANAGEMENT SYSTEM");
        System.out.println("    State University of Zanzibar (SUZA)");
        System.out.println("=============================================\n");

        // TODO: Create University
        // University suza = new University("State University of Zanzibar", 100, 50);

        // TODO: Create Professors
        // Professor prof1 = new Professor("P001", "Dr. Amina Khamis", "amina@suza.ac.tz",
        //                                "+255-777-111-222", "1980-05-15",
        //                                "Computer Science", "2010-09-01",
        //                                "Full", 3500000);
        // Professor prof2 = new Professor("P002", "Dr. Hassan Omar", "hassan@suza.ac.tz",
        //                                "+255-777-333-444", "1975-08-20",
        //                                "Computer Science", "2005-09-01",
        //                                "Associate", 2800000);

        // TODO: Create Students
        // Student std1 = new Student("S001", "Fatma Said", "fatma@student.suza.ac.tz",
        //                           "+255-712-111-222", "2002-03-10",
        //                           "Computer Science", "2022-09-01",
        //                           "BSc Computer Science", 2);
        // Student std2 = new Student("S002", "Ali Juma", "ali@student.suza.ac.tz",
        //                           "+255-712-333-444", "2001-07-25",
        //                           "Computer Science", "2021-09-01",
        //                           "BSc Computer Science", 3);

        // TODO: Create Teaching Assistant
        // TeachingAssistant ta1 = new TeachingAssistant("T001", "Omar Rashid", "omar@suza.ac.tz",
        //                                              "+255-712-555-666", "1998-11-30",
        //                                              "Computer Science", "2023-01-15",
        //                                              15000, prof1);

        // TODO: Create Courses
        // Course oop = new Course("PT821", "Object-Oriented Programming", 3, prof1, 40);
        // Course dsa = new Course("PT822", "Data Structures & Algorithms", 3, prof2, 35);
        // Course db = new Course("PT823", "Database Systems", 3, prof1, 40);

        // TODO: Add members to university
        // suza.addMember(prof1);
        // suza.addMember(prof2);
        // suza.addMember(std1);
        // suza.addMember(std2);
        // suza.addMember(ta1);

        // TODO: Add courses to university
        // suza.addCourse(oop);
        // suza.addCourse(dsa);
        // suza.addCourse(db);

        // TODO: Enroll students in courses
        // System.out.println("--- Enrolling Students ---");
        // std1.enroll("PT821");
        // std1.enroll("PT822");
        // std2.enroll("PT821");
        // std2.enroll("PT823");
        // oop.addStudent(std1);
        // oop.addStudent(std2);

        // TODO: Add grades
        // System.out.println("\n--- Adding Grades ---");
        // std1.addGrade("PT821", 85.5);
        // std1.addGrade("PT822", 78.0);
        // std2.addGrade("PT821", 92.0);
        // std2.addGrade("PT823", 88.5);

        // TODO: Display student information
        // System.out.println("\n--- Student Information ---");
        // std1.displayMemberInfo();
        // System.out.println("GPA: " + std1.calculateGPA());
        // System.out.println("Academic Standing: " + std1.getAcademicStanding());

        // TODO: Display professor information
        // System.out.println("\n--- Professor Information ---");
        // prof1.displayMemberInfo();
        // System.out.println("Monthly Salary: TZS " + prof1.calculatePay());

        // TODO: Display TA information
        // System.out.println("\n--- Teaching Assistant Information ---");
        // ta1.displayMemberInfo();
        // ta1.addGrade("PT821", 90.0);  // TA is also a student
        // System.out.println("GPA: " + ta1.calculateGPA());
        // System.out.println("Monthly Pay: TZS " + ta1.calculatePay());

        // TODO: Test polymorphism with array
        // System.out.println("\n--- Polymorphism Demo ---");
        // UniversityMember[] members = {prof1, std1, ta1};
        // for (UniversityMember m : members) {
        //     System.out.println(m.getRole() + ": " + m.name);
        // }

        // TODO: Calculate payroll using Payable interface
        // System.out.println("\n--- Payroll Demo ---");
        // Payable[] payableMembers = {prof1, prof2, ta1};
        // double totalPayroll = 0;
        // for (Payable p : payableMembers) {
        //     System.out.println(p.getPaymentDetails());
        //     totalPayroll += p.calculatePay();
        // }
        // System.out.println("Total Monthly Payroll: TZS " + totalPayroll);

        // TODO: Display university statistics
        // System.out.println("\n--- University Statistics ---");
        // suza.displayStatistics();

        System.out.println("\n=============================================");
        System.out.println("    END OF UNIVERSITY MANAGEMENT SYSTEM");
        System.out.println("=============================================");
    }
}

/*
 * GRADING CRITERIA:
 *
 * 1. Correct use of interfaces (20%)
 * 2. Correct use of abstract classes (20%)
 * 3. Proper inheritance hierarchy (20%)
 * 4. Polymorphism implementation (20%)
 * 5. Code quality and documentation (20%)
 *
 * BONUS POINTS:
 * - Add "Visitor" class (can tour campus but not enrolled)
 * - Add "Alumni" class (graduated student)
 * - Add "Course Schedule" functionality
 * - Add "Transcript" generation for students
 * - Add exception handling for invalid operations
 *
 * EXPECTED OUTPUT (partial):
 *
 * =============================================
 *     UNIVERSITY MANAGEMENT SYSTEM
 *     State University of Zanzibar (SUZA)
 * =============================================
 *
 * --- Enrolling Students ---
 * Fatma Said enrolled in PT821
 * Fatma Said enrolled in PT822
 * Ali Juma enrolled in PT821
 * Ali Juma enrolled in PT823
 *
 * --- Adding Grades ---
 * Grade added: PT821 = 85.5
 * Grade added: PT822 = 78.0
 * ...
 *
 * --- Student Information ---
 * === University Member Information ===
 * ID: S001
 * Name: Fatma Said
 * Role: Student
 * Department: Computer Science
 * Program: BSc Computer Science
 * Year: 2
 * Enrolled Courses: PT821, PT822
 * GPA: 3.45
 * Academic Standing: Good Standing
 *
 * ... (more output)
 *
 * SUBMISSION:
 * - Complete all TODO sections
 * - Test your code thoroughly
 * - Submit the completed .java file
 * - Due date: Check course schedule
 */
