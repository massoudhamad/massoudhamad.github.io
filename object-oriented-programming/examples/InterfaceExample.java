/**
 * Interface Example - Object-Oriented Programming
 * PT821 - State University of Zanzibar (SUZA)
 *
 * This example demonstrates:
 * - Interface declaration
 * - Implementing interfaces
 * - Multiple interface implementation
 * - Interface vs Abstract Class
 * - Default methods in interfaces (Java 8+)
 */

// ============================================
// BASIC INTERFACES
// ============================================

// Interface for objects that can be drawn
interface Drawable {
    void draw();  // public abstract by default
    void setColor(String color);
}

// Interface for objects that can be resized
interface Resizable {
    void resize(double factor);
    double getSize();
}

// Interface for objects that can be moved
interface Movable {
    void moveUp(int units);
    void moveDown(int units);
    void moveLeft(int units);
    void moveRight(int units);
    int getX();
    int getY();
}

// Interface with default method (Java 8+)
interface Printable {
    void print();

    // Default method - provides default implementation
    default void printWithBorder() {
        System.out.println("====================");
        print();
        System.out.println("====================");
    }
}

// ============================================
// CLASS IMPLEMENTING MULTIPLE INTERFACES
// ============================================

class GraphicCircle implements Drawable, Resizable, Movable, Printable {
    private String color;
    private double radius;
    private int x, y;  // position

    public GraphicCircle(double radius, String color, int x, int y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Implementing Drawable
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Color changed to: " + color);
    }

    // Implementing Resizable
    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }

    @Override
    public double getSize() {
        return radius;
    }

    // Implementing Movable
    @Override
    public void moveUp(int units) {
        y -= units;
        System.out.println("Moved up to (" + x + ", " + y + ")");
    }

    @Override
    public void moveDown(int units) {
        y += units;
        System.out.println("Moved down to (" + x + ", " + y + ")");
    }

    @Override
    public void moveLeft(int units) {
        x -= units;
        System.out.println("Moved left to (" + x + ", " + y + ")");
    }

    @Override
    public void moveRight(int units) {
        x += units;
        System.out.println("Moved right to (" + x + ", " + y + ")");
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    // Implementing Printable
    @Override
    public void print() {
        System.out.println("Circle: radius=" + radius + ", color=" + color);
        System.out.println("Position: (" + x + ", " + y + ")");
    }
}

// ============================================
// REAL-WORLD EXAMPLE: E-COMMERCE SYSTEM
// ============================================

// Interface for items that can be purchased
interface Purchasable {
    double getPrice();
    String getProductName();
    boolean isInStock();
}

// Interface for items that can be shipped
interface Shippable {
    double getWeight();
    String getShippingAddress();
    double calculateShippingCost();
}

// Interface for items that can be reviewed
interface Reviewable {
    void addReview(String review, int rating);
    double getAverageRating();
    int getReviewCount();
}

// Interface for items that have discounts
interface Discountable {
    void applyDiscount(double percentage);
    double getDiscountedPrice();
    boolean hasDiscount();
}

// Product class implementing multiple interfaces
class Product implements Purchasable, Shippable, Reviewable, Discountable {
    private String name;
    private double price;
    private double weight;
    private int stock;
    private String shippingAddress;
    private double discount;
    private int totalRating;
    private int reviewCount;

    public Product(String name, double price, double weight, int stock) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
        this.discount = 0;
        this.totalRating = 0;
        this.reviewCount = 0;
    }

    // Purchasable implementation
    @Override
    public double getPrice() { return price; }

    @Override
    public String getProductName() { return name; }

    @Override
    public boolean isInStock() { return stock > 0; }

    // Shippable implementation
    @Override
    public double getWeight() { return weight; }

    @Override
    public String getShippingAddress() { return shippingAddress; }

    public void setShippingAddress(String address) {
        this.shippingAddress = address;
    }

    @Override
    public double calculateShippingCost() {
        // Simple calculation: TZS 500 per kg
        return weight * 500;
    }

    // Reviewable implementation
    @Override
    public void addReview(String review, int rating) {
        if (rating >= 1 && rating <= 5) {
            totalRating += rating;
            reviewCount++;
            System.out.println("Review added: \"" + review + "\" - " + rating + " stars");
        }
    }

    @Override
    public double getAverageRating() {
        return reviewCount > 0 ? (double) totalRating / reviewCount : 0;
    }

    @Override
    public int getReviewCount() { return reviewCount; }

    // Discountable implementation
    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
        System.out.println(percentage + "% discount applied to " + name);
    }

    @Override
    public double getDiscountedPrice() {
        return price * (1 - discount / 100);
    }

    @Override
    public boolean hasDiscount() { return discount > 0; }

    // Display product info
    public void displayInfo() {
        System.out.println("\n--- Product Information ---");
        System.out.println("Name: " + name);
        System.out.println("Original Price: TZS " + String.format("%,.2f", price));
        if (hasDiscount()) {
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discounted Price: TZS " + String.format("%,.2f", getDiscountedPrice()));
        }
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Shipping Cost: TZS " + String.format("%,.2f", calculateShippingCost()));
        System.out.println("In Stock: " + (isInStock() ? "Yes (" + stock + " units)" : "No"));
        System.out.println("Rating: " + String.format("%.1f", getAverageRating()) + "/5 (" + reviewCount + " reviews)");
    }
}

// ============================================
// INTERFACE FOR PAYMENT PROCESSING
// ============================================

interface PaymentProcessor {
    boolean processPayment(double amount);
    void refund(double amount);
    String getPaymentMethod();
}

class MPesaPayment implements PaymentProcessor {
    private String phoneNumber;

    public MPesaPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing M-Pesa payment of TZS " + String.format("%,.2f", amount));
        System.out.println("Sending payment request to " + phoneNumber);
        System.out.println("Payment successful!");
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding TZS " + String.format("%,.2f", amount) + " to " + phoneNumber);
    }

    @Override
    public String getPaymentMethod() { return "M-Pesa"; }
}

class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    private String cardHolder;

    public CreditCardProcessor(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean processPayment(double amount) {
        String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing Credit Card payment of TZS " + String.format("%,.2f", amount));
        System.out.println("Card: " + masked + " (" + cardHolder + ")");
        System.out.println("Payment successful!");
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding TZS " + String.format("%,.2f", amount) + " to card");
    }

    @Override
    public String getPaymentMethod() { return "Credit Card"; }
}

// ============================================
// SHOPPING CART using interfaces
// ============================================

class ShoppingCart {
    private Purchasable[] items;
    private int itemCount;
    private PaymentProcessor paymentProcessor;

    public ShoppingCart(int capacity) {
        items = new Purchasable[capacity];
        itemCount = 0;
    }

    public void addItem(Purchasable item) {
        if (itemCount < items.length && item.isInStock()) {
            items[itemCount++] = item;
            System.out.println(item.getProductName() + " added to cart");
        }
    }

    public void setPaymentProcessor(PaymentProcessor processor) {
        this.paymentProcessor = processor;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof Discountable) {
                total += ((Discountable) items[i]).getDiscountedPrice();
            } else {
                total += items[i].getPrice();
            }
        }
        return total;
    }

    public void checkout() {
        System.out.println("\n=== CHECKOUT ===");
        System.out.println("Items in cart: " + itemCount);
        for (int i = 0; i < itemCount; i++) {
            System.out.println("- " + items[i].getProductName() + ": TZS " +
                             String.format("%,.2f", items[i].getPrice()));
        }
        System.out.println("Total: TZS " + String.format("%,.2f", getTotal()));

        if (paymentProcessor != null) {
            System.out.println("\nPayment Method: " + paymentProcessor.getPaymentMethod());
            paymentProcessor.processPayment(getTotal());
        }
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    INTERFACE EXAMPLE");
        System.out.println("==========================================\n");

        // ========== PART 1: GRAPHIC OBJECTS ==========
        System.out.println("=== PART 1: GRAPHIC OBJECTS ===\n");

        GraphicCircle circle = new GraphicCircle(50, "Blue", 100, 100);

        // Using as Drawable
        System.out.println("--- Using as Drawable ---");
        Drawable drawable = circle;
        drawable.draw();
        drawable.setColor("Red");

        // Using as Resizable
        System.out.println("\n--- Using as Resizable ---");
        Resizable resizable = circle;
        System.out.println("Current size: " + resizable.getSize());
        resizable.resize(1.5);
        System.out.println("New size: " + resizable.getSize());

        // Using as Movable
        System.out.println("\n--- Using as Movable ---");
        Movable movable = circle;
        movable.moveRight(20);
        movable.moveUp(10);

        // Using as Printable (with default method)
        System.out.println("\n--- Using as Printable ---");
        Printable printable = circle;
        printable.printWithBorder();

        // ========== PART 2: E-COMMERCE SYSTEM ==========
        System.out.println("\n=== PART 2: E-COMMERCE SYSTEM ===");

        // Create products
        Product laptop = new Product("Dell Laptop", 1500000, 2.5, 10);
        Product phone = new Product("Samsung Galaxy", 800000, 0.3, 25);
        Product headphones = new Product("Sony Headphones", 150000, 0.4, 50);

        // Apply discounts
        laptop.applyDiscount(10);
        phone.applyDiscount(5);

        // Add reviews
        laptop.addReview("Great laptop!", 5);
        laptop.addReview("Good value", 4);
        phone.addReview("Excellent phone", 5);
        phone.addReview("Nice camera", 4);
        phone.addReview("Battery could be better", 3);

        // Display product info
        laptop.displayInfo();
        phone.displayInfo();
        headphones.displayInfo();

        // ========== PART 3: SHOPPING CART ==========
        System.out.println("\n=== PART 3: SHOPPING CART ===");

        ShoppingCart cart = new ShoppingCart(10);
        cart.addItem(laptop);
        cart.addItem(phone);
        cart.addItem(headphones);

        // Set payment processor (can be changed easily!)
        System.out.println("\n--- Using M-Pesa Payment ---");
        cart.setPaymentProcessor(new MPesaPayment("+255-712-345-678"));
        cart.checkout();

        System.out.println("\n--- Using Credit Card Payment ---");
        cart.setPaymentProcessor(new CreditCardProcessor("4532015112830366", "FATMA OMAR"));
        cart.checkout();

        System.out.println("\n==========================================");
        System.out.println("    END OF INTERFACE EXAMPLE");
        System.out.println("==========================================");
    }
}

/*
 * KEY CONCEPTS:
 *
 * 1. INTERFACE:
 *    - Declared with 'interface' keyword
 *    - All methods are public abstract by default
 *    - All variables are public static final (constants)
 *    - Cannot be instantiated
 *
 * 2. IMPLEMENTING INTERFACES:
 *    - Use 'implements' keyword
 *    - A class can implement MULTIPLE interfaces
 *    - Must provide implementation for ALL methods
 *
 * 3. INTERFACE VS ABSTRACT CLASS:
 *    - Interface: CAN-DO relationship (capabilities)
 *    - Abstract Class: IS-A relationship (inheritance)
 *    - Interface: Multiple implementation allowed
 *    - Abstract Class: Single inheritance only
 *
 * 4. DEFAULT METHODS (Java 8+):
 *    - Can provide default implementation in interface
 *    - Classes can override if needed
 *
 * COMPILE: javac InterfaceExample.java
 * RUN: java InterfaceExample
 */
