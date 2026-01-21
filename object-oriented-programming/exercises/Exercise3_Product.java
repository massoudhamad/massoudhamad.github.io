/**
 * EXERCISE 3: Product Inventory Class
 * PT821: Object-Oriented Programming - Classes and Objects
 *
 * TASK: Complete the Product class for an inventory management system
 *
 * Requirements:
 * 1. Add the following private attributes:
 *    - productCode (String)
 *    - productName (String)
 *    - category (String)
 *    - unitPrice (double)
 *    - quantityInStock (int)
 *    - reorderLevel (int) - minimum stock before reorder alert
 *
 * 2. Create constructors:
 *    - Default constructor
 *    - Parameterized constructor (productCode, productName, category, unitPrice, quantityInStock)
 *    - Set default reorderLevel to 10
 *
 * 3. Add getters for all attributes
 *
 * 4. Add setters with validation:
 *    - unitPrice must be > 0
 *    - quantityInStock must be >= 0
 *    - reorderLevel must be > 0
 *
 * 5. Add behavior methods:
 *    - addStock(int quantity) - adds to current stock
 *    - sellProduct(int quantity) - removes from stock if available, returns true/false
 *    - calculateStockValue() - returns unitPrice * quantityInStock
 *    - needsReorder() - returns true if stock <= reorderLevel
 *    - applyDiscount(double percentage) - reduces unit price
 *    - displayProductInfo() - shows all product details
 *
 * 6. Test your class with at least 3 different products
 */
public class Exercise3_Product {

    // TODO: Add private attributes here


    // TODO: Add default constructor


    // TODO: Add parameterized constructor


    // TODO: Add getters


    // TODO: Add setters with validation


    // TODO: Add addStock() method


    // TODO: Add sellProduct() method


    // TODO: Add calculateStockValue() method


    // TODO: Add needsReorder() method


    // TODO: Add applyDiscount() method


    // TODO: Add displayProductInfo() method


    public static void main(String[] args) {
        System.out.println("=== Product Inventory Exercise ===\n");

        // TODO: Create product1 - "PRD001", "Laptop", "Electronics", 1500000, 25


        // TODO: Create product2 - "PRD002", "Office Chair", "Furniture", 350000, 8


        // TODO: Create product3 - "PRD003", "Notebook", "Stationery", 5000, 100


        // TODO: Display all products info


        // TODO: Sell 20 laptops


        // TODO: Check if product2 needs reorder


        // TODO: Add 50 units to product2 stock


        // TODO: Apply 15% discount to product3


        // TODO: Display final stock values for all products


        System.out.println("\n=== Exercise Complete ===");
    }
}
