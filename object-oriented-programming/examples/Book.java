/**
 * Book.java - Lab Exercise Solution
 * PT821: Object-Oriented Programming
 * Lecture 3: Classes and Objects
 *
 * This class demonstrates a complete implementation of a Book class
 * with encapsulation, validation, and multiple behaviors.
 */
public class Book {
    // ============================================
    // ATTRIBUTES (Private for Encapsulation)
    // ============================================
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int pages;
    private boolean available;

    // ============================================
    // CONSTRUCTORS
    // ============================================

    /**
     * Default Constructor
     * Creates a book with default values
     */
    public Book() {
        this.isbn = "000-0-00-000000-0";
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.pages = 0;
        this.available = true;
    }

    /**
     * Parameterized Constructor - Basic
     * @param title The book title
     * @param author The book author
     */
    public Book(String title, String author) {
        this.isbn = "000-0-00-000000-0";
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.pages = 0;
        this.available = true;
    }

    /**
     * Parameterized Constructor - Full
     * @param isbn The ISBN number
     * @param title The book title
     * @param author The book author
     * @param price The book price
     * @param pages Number of pages
     */
    public Book(String isbn, String title, String author, double price, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        setPrice(price);  // Use setter for validation
        setPages(pages);  // Use setter for validation
        this.available = true;
    }

    /**
     * Copy Constructor
     * @param other The book to copy
     */
    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.pages = other.pages;
        this.available = other.available;
    }

    // ============================================
    // GETTERS
    // ============================================

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return available;
    }

    // ============================================
    // SETTERS with Validation
    // ============================================

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: ISBN cannot be empty!");
        }
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty!");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be empty!");
        }
    }

    /**
     * Sets the book price with validation
     * @param price The price (must be positive)
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be positive!");
        }
    }

    /**
     * Sets the number of pages with validation
     * @param pages The number of pages (must be greater than 0)
     */
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Error: Pages must be greater than 0!");
        }
    }

    // ============================================
    // BEHAVIOR METHODS
    // ============================================

    /**
     * Borrows the book (changes availability to false)
     */
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("SUCCESS: '" + title + "' has been borrowed.");
            System.out.println("Please return within 14 days.");
        } else {
            System.out.println("SORRY: '" + title + "' is not available.");
            System.out.println("Please check back later or reserve the book.");
        }
    }

    /**
     * Returns the book (changes availability to true)
     */
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("SUCCESS: '" + title + "' has been returned.");
            System.out.println("Thank you for returning the book!");
        } else {
            System.out.println("NOTE: '" + title + "' was not borrowed.");
        }
    }

    /**
     * Reserves the book if not available
     * @param patronName The name of the person reserving
     */
    public void reserve(String patronName) {
        if (!available) {
            System.out.println("RESERVED: '" + title + "' has been reserved for " + patronName);
            System.out.println("You will be notified when the book is available.");
        } else {
            System.out.println("'" + title + "' is currently available. You can borrow it now!");
        }
    }

    /**
     * Applies a discount to the book price
     * @param discountPercent The discount percentage (0-100)
     */
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            double discount = price * (discountPercent / 100);
            price = price - discount;
            System.out.println("Discount applied! New price: TZS " + String.format("%.2f", price));
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    /**
     * Checks if the book is a long read
     * @return true if book has more than 300 pages
     */
    public boolean isLongRead() {
        return pages > 300;
    }

    /**
     * Displays detailed book information
     */
    public void displayInfo() {
        System.out.println("================================");
        System.out.println("       BOOK INFORMATION        ");
        System.out.println("================================");
        System.out.println("ISBN:      " + isbn);
        System.out.println("Title:     " + title);
        System.out.println("Author:    " + author);
        System.out.println("Price:     TZS " + String.format("%.2f", price));
        System.out.println("Pages:     " + pages);
        System.out.println("Status:    " + (available ? "Available" : "Borrowed"));
        System.out.println("Long Read: " + (isLongRead() ? "Yes" : "No"));
        System.out.println("================================");
    }

    /**
     * Returns a short description of the book
     * @return String representation
     */
    public String toString() {
        return "Book['" + title + "' by " + author + " - " + (available ? "Available" : "Borrowed") + "]";
    }
}
