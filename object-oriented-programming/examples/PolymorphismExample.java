/**
 * Polymorphism Example - Object-Oriented Programming
 * PT821 - State University of Zanzibar (SUZA)
 *
 * This example demonstrates:
 * - Method Overloading (Compile-time Polymorphism)
 * - Method Overriding (Runtime Polymorphism)
 * - Dynamic method dispatch
 * - Using parent reference for child objects
 */

// ============================================
// PART 1: METHOD OVERLOADING (Compile-time Polymorphism)
// ============================================

class Calculator {
    // Method with 2 integer parameters
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Overloaded: 3 integer parameters
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Overloaded: 2 double parameters
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Overloaded: String concatenation
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }

    // Overloaded: different order of parameters
    public double add(int a, double b) {
        System.out.println("Adding int and double");
        return a + b;
    }

    public double add(double a, int b) {
        System.out.println("Adding double and int");
        return a + b;
    }
}

// ============================================
// PART 2: METHOD OVERRIDING (Runtime Polymorphism)
// ============================================

// Base class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
}

// Child class 1
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the " + breed + " says: Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " is running on four legs");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

// Child class 2
class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the " + color + " cat says: Meow!");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking gracefully");
    }

    // Cat-specific method
    public void scratch() {
        System.out.println(name + " is scratching the furniture");
    }
}

// Child class 3
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println(name + " is flying in the sky");
        } else {
            System.out.println(name + " is walking (cannot fly)");
        }
    }
}

// Child class 4
class Fish extends Animal {
    private String waterType;

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes bubbles: Blub! Blub!");
    }

    @Override
    public void move() {
        System.out.println(name + " is swimming in " + waterType + " water");
    }
}

// ============================================
// PART 3: REAL-WORLD EXAMPLE - Payment System
// ============================================

class Payment {
    protected double amount;
    protected String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void processPayment() {
        System.out.println("Processing generic payment of " + amount + " " + currency);
    }

    public void printReceipt() {
        System.out.println("Receipt: Payment of " + amount + " " + currency);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolder) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        String maskedCard = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing Credit Card payment");
        System.out.println("Card: " + maskedCard);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Status: APPROVED");
    }
}

class MobileMoneyPayment extends Payment {
    private String phoneNumber;
    private String provider;

    public MobileMoneyPayment(double amount, String currency, String phoneNumber, String provider) {
        super(amount, currency);
        this.phoneNumber = phoneNumber;
        this.provider = provider;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing " + provider + " Mobile Money payment");
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Status: Waiting for PIN confirmation...");
        System.out.println("Status: APPROVED");
    }
}

class BankTransferPayment extends Payment {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(double amount, String currency, String accountNumber, String bankName) {
        super(amount, currency);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Bank Transfer payment");
        System.out.println("Bank: " + bankName);
        System.out.println("Account: " + accountNumber);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Status: PENDING (1-2 business days)");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    POLYMORPHISM EXAMPLE");
        System.out.println("========================================\n");

        // ========== PART 1: METHOD OVERLOADING ==========
        System.out.println("=== PART 1: METHOD OVERLOADING ===\n");

        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 10));
        System.out.println("Result: " + calc.add(5, 10, 15));
        System.out.println("Result: " + calc.add(5.5, 10.5));
        System.out.println("Result: " + calc.add("Hello, ", "World!"));
        System.out.println("Result: " + calc.add(5, 10.5));
        System.out.println("Result: " + calc.add(5.5, 10));

        // ========== PART 2: METHOD OVERRIDING ==========
        System.out.println("\n=== PART 2: METHOD OVERRIDING ===\n");

        // Creating objects with parent reference (Polymorphism!)
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Generic Animal");
        animals[1] = new Dog("Simba", "German Shepherd");
        animals[2] = new Cat("Mimi", "orange");
        animals[3] = new Bird("Tweety", true);
        animals[4] = new Fish("Nemo", "salt");

        // Polymorphic behavior - same method call, different results
        System.out.println("--- All animals making sounds ---");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("\n--- All animals moving ---");
        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println("\n--- All animals eating ---");
        for (Animal animal : animals) {
            animal.eat();  // Not overridden - uses parent's method
        }

        // Accessing child-specific methods (need casting)
        System.out.println("\n--- Child-specific methods ---");
        Dog dog = (Dog) animals[1];
        dog.fetch();

        Cat cat = (Cat) animals[2];
        cat.scratch();

        // ========== PART 3: REAL-WORLD PAYMENT SYSTEM ==========
        System.out.println("\n=== PART 3: PAYMENT SYSTEM ===\n");

        // Array of different payment types
        Payment[] payments = new Payment[3];
        payments[0] = new CreditCardPayment(150000, "TZS", "4532015112830366", "FATMA OMAR");
        payments[1] = new MobileMoneyPayment(50000, "TZS", "+255-712-345-678", "M-Pesa");
        payments[2] = new BankTransferPayment(500000, "TZS", "0150123456789", "CRDB Bank");

        // Process all payments polymorphically
        for (int i = 0; i < payments.length; i++) {
            System.out.println("--- Payment " + (i + 1) + " ---");
            payments[i].processPayment();
            payments[i].printReceipt();
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("    END OF POLYMORPHISM EXAMPLE");
        System.out.println("========================================");
    }
}

/*
 * KEY CONCEPTS:
 *
 * 1. METHOD OVERLOADING (Compile-time Polymorphism):
 *    - Same method name, different parameters
 *    - Decided at compile time
 *    - Can differ by: number, type, or order of parameters
 *
 * 2. METHOD OVERRIDING (Runtime Polymorphism):
 *    - Child class provides different implementation
 *    - Decided at runtime based on actual object
 *    - Use @Override annotation
 *    - Method signature must be the same
 *
 * 3. BENEFITS:
 *    - Code flexibility and extensibility
 *    - Write generic code that works with any subclass
 *    - Easy to add new types without changing existing code
 *
 * COMPILE: javac PolymorphismExample.java
 * RUN: java PolymorphismExample
 */
