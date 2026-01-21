/**
 * EXERCISE 2: Employee Class
 * PT821: Object-Oriented Programming - Classes and Objects
 *
 * TASK: Complete the Employee class for a company payroll system
 *
 * Requirements:
 * 1. Add the following private attributes:
 *    - employeeId (String)
 *    - fullName (String)
 *    - department (String)
 *    - basicSalary (double)
 *    - yearsOfService (int)
 *
 * 2. Create constructors:
 *    - Default constructor
 *    - Parameterized constructor (employeeId, fullName, department, basicSalary)
 *
 * 3. Add getters for all attributes
 *
 * 4. Add setters with validation:
 *    - basicSalary must be >= 500000 (minimum wage)
 *    - yearsOfService must be >= 0
 *
 * 5. Add behavior methods:
 *    - calculateBonus() - returns 10% of salary for each year of service (max 50%)
 *    - calculateNetSalary() - basicSalary + bonus - 15% tax
 *    - promote(String newDepartment, double salaryIncrease) - updates department and salary
 *    - displayPayslip() - shows detailed payslip
 *
 * 6. Test your class in the main method with at least 2 employees
 */
public class Exercise2_Employee {

    // TODO: Add private attributes here


    // TODO: Add default constructor


    // TODO: Add parameterized constructor


    // TODO: Add getters


    // TODO: Add setters with validation


    // TODO: Add calculateBonus() method


    // TODO: Add calculateNetSalary() method


    // TODO: Add promote() method


    // TODO: Add displayPayslip() method


    public static void main(String[] args) {
        System.out.println("=== Employee Payroll Exercise ===\n");

        // TODO: Create employee1 - "EMP001", "Ali Hassan", "IT", 1500000


        // TODO: Create employee2 - "EMP002", "Fatma Said", "HR", 1200000


        // TODO: Set years of service (employee1 = 5 years, employee2 = 2 years)


        // TODO: Display payslip for both employees


        // TODO: Promote employee1 to "Senior IT" with 300000 salary increase


        // TODO: Display employee1 payslip after promotion


        System.out.println("\n=== Exercise Complete ===");
    }
}
