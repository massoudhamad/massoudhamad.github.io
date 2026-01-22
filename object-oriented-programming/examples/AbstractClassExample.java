/**
 * Abstract Class Example - Object-Oriented Programming
 * PT821 - State University of Zanzibar (SUZA)
 *
 * This example demonstrates:
 * - Abstract class declaration
 * - Abstract methods (no body)
 * - Concrete methods (with body)
 * - Constructors in abstract classes
 * - Implementing abstract methods in subclasses
 */

// ============================================
// ABSTRACT CLASS: Shape
// ============================================

abstract class Shape {
    protected String name;
    protected String color;

    // Constructor - abstract classes CAN have constructors
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Abstract methods - MUST be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method - shared by all shapes
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
        System.out.println("Area: " + String.format("%.2f", calculateArea()) + " sq units");
        System.out.println("Perimeter: " + String.format("%.2f", calculatePerimeter()) + " units");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

// ============================================
// CONCRETE CLASS: Circle
// ============================================

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Circle-specific method
    public double getDiameter() {
        return 2 * radius;
    }
}

// ============================================
// CONCRETE CLASS: Rectangle
// ============================================

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Rectangle-specific method
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}

// ============================================
// CONCRETE CLASS: Square (extends Rectangle)
// ============================================

class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
        this.name = "Square";  // Override the name
    }

    // Override to provide cleaner output
    @Override
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
        System.out.println("Side: " + width + " units");
        System.out.println("Area: " + String.format("%.2f", calculateArea()) + " sq units");
        System.out.println("Perimeter: " + String.format("%.2f", calculatePerimeter()) + " units");
    }
}

// ============================================
// CONCRETE CLASS: Triangle
// ============================================

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super("Triangle", color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    // Check if it's a valid triangle
    public boolean isValid() {
        return (sideA + sideB > sideC) &&
               (sideB + sideC > sideA) &&
               (sideA + sideC > sideB);
    }
}

// ============================================
// REAL-WORLD EXAMPLE: Employee Management
// ============================================

abstract class Employee {
    protected String name;
    protected String employeeId;
    protected double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // Abstract method - each employee type calculates salary differently
    public abstract double calculateSalary();

    // Abstract method - each employee type has different benefits
    public abstract String getBenefits();

    // Concrete method - shared by all employees
    public void displayPayslip() {
        System.out.println("========== PAYSLIP ==========");
        System.out.println("Employee: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Base Salary: TZS " + String.format("%,.2f", baseSalary));
        System.out.println("Total Salary: TZS " + String.format("%,.2f", calculateSalary()));
        System.out.println("Benefits: " + getBenefits());
        System.out.println("=============================\n");
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;
    private double allowances;

    public FullTimeEmployee(String name, String employeeId, double baseSalary,
                           double bonus, double allowances) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
        this.allowances = allowances;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus + allowances;
    }

    @Override
    public String getBenefits() {
        return "Health Insurance, Pension, Annual Leave (30 days)";
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, 0);  // No base salary for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getBenefits() {
        return "Flexible hours, No fixed benefits";
    }

    @Override
    public void displayPayslip() {
        System.out.println("========== PAYSLIP ==========");
        System.out.println("Employee: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Type: Part-Time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: TZS " + String.format("%,.2f", hourlyRate));
        System.out.println("Total Salary: TZS " + String.format("%,.2f", calculateSalary()));
        System.out.println("Benefits: " + getBenefits());
        System.out.println("=============================\n");
    }
}

class ContractEmployee extends Employee {
    private int contractMonths;
    private double projectBonus;

    public ContractEmployee(String name, String employeeId, double baseSalary,
                           int contractMonths, double projectBonus) {
        super(name, employeeId, baseSalary);
        this.contractMonths = contractMonths;
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + projectBonus;
    }

    @Override
    public String getBenefits() {
        return "Project completion bonus, " + contractMonths + "-month contract";
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    ABSTRACT CLASS EXAMPLE");
        System.out.println("==========================================\n");

        // ========== PART 1: SHAPE EXAMPLE ==========
        System.out.println("=== PART 1: SHAPES ===\n");

        // Cannot instantiate abstract class
        // Shape s = new Shape("Test", "Red");  // ERROR!

        // Create array of shapes (polymorphism with abstract class)
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Square("Green", 5.0);
        shapes[3] = new Triangle("Yellow", 3.0, 4.0, 5.0);

        // Display info for all shapes
        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println();
        }

        // Calculate total area of all shapes
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Total area of all shapes: " + String.format("%.2f", totalArea) + " sq units\n");

        // ========== PART 2: EMPLOYEE EXAMPLE ==========
        System.out.println("=== PART 2: EMPLOYEES ===\n");

        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Ali Hassan", "FT001", 2000000, 300000, 200000);
        employees[1] = new PartTimeEmployee("Fatma Said", "PT001", 15000, 80);
        employees[2] = new ContractEmployee("Omar Juma", "CT001", 1500000, 6, 500000);

        // Display payslips for all employees
        for (Employee emp : employees) {
            emp.displayPayslip();
        }

        // Calculate total payroll
        double totalPayroll = 0;
        for (Employee emp : employees) {
            totalPayroll += emp.calculateSalary();
        }
        System.out.println("Total Monthly Payroll: TZS " + String.format("%,.2f", totalPayroll));

        System.out.println("\n==========================================");
        System.out.println("    END OF ABSTRACT CLASS EXAMPLE");
        System.out.println("==========================================");
    }
}

/*
 * KEY CONCEPTS:
 *
 * 1. ABSTRACT CLASS:
 *    - Declared with 'abstract' keyword
 *    - Cannot be instantiated directly
 *    - Can have both abstract and concrete methods
 *    - Can have constructors, instance variables
 *
 * 2. ABSTRACT METHODS:
 *    - No method body (ends with semicolon)
 *    - MUST be implemented by concrete subclasses
 *    - Defines a contract for subclasses
 *
 * 3. WHEN TO USE:
 *    - When classes share common behavior
 *    - When you want to provide default implementation
 *    - When subclasses are closely related (IS-A relationship)
 *
 * COMPILE: javac AbstractClassExample.java
 * RUN: java AbstractClassExample
 */
