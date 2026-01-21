/**
 * BookDemo.java - Demonstrates using the Book class
 * PT821: Object-Oriented Programming
 * Lecture 3: Classes and Objects
 *
 * This program demonstrates how to create and use Book objects.
 */
public class BookDemo {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("     BOOK CLASS DEMONSTRATION");
        System.out.println("====================================\n");

        // ============================================
        // 1. Creating Books Using Different Constructors
        // ============================================
        System.out.println("--- Creating Books ---\n");

        // Default constructor
        Book book1 = new Book();
        System.out.println("Created book1 with default constructor");

        // Basic parameterized constructor
        Book book2 = new Book("Java: The Complete Reference", "Herbert Schildt");
        System.out.println("Created book2: " + book2.getTitle());

        // Full parameterized constructor
        Book book3 = new Book(
            "978-0-13-468599-1",
            "Effective Java",
            "Joshua Bloch",
            75000.00,
            416
        );
        System.out.println("Created book3: " + book3.getTitle());

        // Copy constructor
        Book book4 = new Book(book3);
        System.out.println("Created book4 as copy of book3: " + book4.getTitle());

        System.out.println();

        // ============================================
        // 2. Setting Values Using Setters
        // ============================================
        System.out.println("--- Setting Book Values ---\n");

        book1.setIsbn("978-0-596-00712-6");
        book1.setTitle("Head First Java");
        book1.setAuthor("Kathy Sierra & Bert Bates");
        book1.setPrice(55000.00);
        book1.setPages(720);

        book2.setIsbn("978-1-260-44023-5");
        book2.setPrice(85000.00);
        book2.setPages(1248);

        System.out.println("Book details updated!\n");

        // ============================================
        // 3. Displaying Book Information
        // ============================================
        System.out.println("--- Book Information ---\n");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();

        // ============================================
        // 4. Borrowing and Returning Books
        // ============================================
        System.out.println("\n--- Borrowing and Returning ---\n");

        // Borrow a book
        book1.borrow();
        System.out.println();

        // Try to borrow the same book again
        System.out.println("Trying to borrow the same book again:");
        book1.borrow();
        System.out.println();

        // Return the book
        book1.returnBook();
        System.out.println();

        // Try to return again
        System.out.println("Trying to return when already available:");
        book1.returnBook();

        // ============================================
        // 5. Reserving Books
        // ============================================
        System.out.println("\n--- Reserving Books ---\n");

        // First borrow the book
        book2.borrow();
        System.out.println();

        // Now reserve it
        book2.reserve("Ali Hassan");
        System.out.println();

        // Try to reserve an available book
        book3.reserve("Fatma Said");

        // ============================================
        // 6. Applying Discounts
        // ============================================
        System.out.println("\n--- Applying Discounts ---\n");

        System.out.println("Original price of book3: TZS " + book3.getPrice());
        book3.applyDiscount(20);  // 20% discount
        System.out.println();

        System.out.println("Trying invalid discount (150%):");
        book3.applyDiscount(150);

        // ============================================
        // 7. Checking Book Properties
        // ============================================
        System.out.println("\n--- Checking Book Properties ---\n");

        System.out.println("Is '" + book1.getTitle() + "' a long read? " + book1.isLongRead());
        System.out.println("Is '" + book3.getTitle() + "' a long read? " + book3.isLongRead());

        // ============================================
        // 8. Using toString()
        // ============================================
        System.out.println("\n--- Book Summary (toString) ---\n");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // ============================================
        // 9. Validation Testing
        // ============================================
        System.out.println("\n--- Testing Validation ---\n");

        System.out.println("Setting negative price:");
        book1.setPrice(-100);

        System.out.println("\nSetting zero pages:");
        book1.setPages(0);

        System.out.println("\nSetting empty title:");
        book1.setTitle("");

        // ============================================
        // 10. Final Status
        // ============================================
        System.out.println("\n--- Final Book Status ---\n");

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);

        System.out.println("\n====================================");
        System.out.println("     DEMONSTRATION COMPLETE!");
        System.out.println("====================================");
    }
}
