/**
 * BankDemo.java - Demonstrates the BankAccount class
 * PT821: Object-Oriented Programming
 * Lecture 3: Classes and Objects
 *
 * This program demonstrates banking operations with the BankAccount class.
 */
public class BankDemo {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   BANK ACCOUNT DEMONSTRATION");
        System.out.println("====================================\n");

        // ============================================
        // 1. Creating Bank Accounts
        // ============================================
        System.out.println("--- Creating Bank Accounts ---\n");

        // Create accounts using different constructors
        BankAccount account1 = new BankAccount("Ali Hassan", 50000.00, "Savings");
        BankAccount account2 = new BankAccount("Fatma Said", 100000.00, "Current");
        BankAccount account3 = new BankAccount();  // Default constructor

        System.out.println("Created 3 bank accounts");

        // Display account information
        System.out.println("\n--- Account Information ---\n");
        account1.displayInfo();
        System.out.println();
        account2.displayInfo();
        System.out.println();
        account3.displayInfo();

        // ============================================
        // 2. Deposit Operations
        // ============================================
        System.out.println("\n--- Deposit Operations ---\n");

        account1.deposit(25000.00);
        System.out.println();
        account2.deposit(50000.00);

        // Invalid deposit
        System.out.println("\nTrying invalid deposit (negative amount):");
        account1.deposit(-5000.00);

        // ============================================
        // 3. Withdrawal Operations
        // ============================================
        System.out.println("\n--- Withdrawal Operations ---\n");

        account1.withdraw(20000.00);
        System.out.println();
        account2.withdraw(30000.00);

        // Invalid withdrawal - insufficient funds
        System.out.println("\nTrying to withdraw more than balance:");
        account3.withdraw(10000.00);

        // Invalid withdrawal - minimum balance (savings)
        System.out.println("\nTrying to go below minimum balance (savings):");
        BankAccount savingsTest = new BankAccount("Test User", 2000.00, "Savings");
        savingsTest.withdraw(1500.00);  // Would leave less than TZS 1000

        // ============================================
        // 4. Check Balance
        // ============================================
        System.out.println("\n--- Checking Balances ---");
        account1.checkBalance();
        account2.checkBalance();

        // ============================================
        // 5. Transfer Operations
        // ============================================
        System.out.println("\n--- Transfer Operations ---");

        // Transfer from account1 to account2
        account1.transfer(account2, 15000.00);

        // Check balances after transfer
        System.out.println("\nBalances after transfer:");
        System.out.println(account1);
        System.out.println(account2);

        // Invalid transfer - insufficient funds
        System.out.println("\nTrying transfer with insufficient funds:");
        account1.transfer(account2, 500000.00);

        // Invalid transfer - same account
        System.out.println("\nTrying transfer to same account:");
        account1.transfer(account1, 1000.00);

        // ============================================
        // 6. Account Deactivation
        // ============================================
        System.out.println("\n--- Account Deactivation ---\n");

        // Try to deactivate account with balance
        System.out.println("Trying to deactivate account with balance:");
        account1.deactivate();

        // Create a zero-balance account and deactivate
        System.out.println("\nDeactivating empty account:");
        account3.deactivate();

        // Try operations on inactive account
        System.out.println("\nTrying deposit on inactive account:");
        account3.deposit(5000.00);

        // Reactivate account
        System.out.println("\nReactivating account:");
        account3.activate();
        account3.deposit(5000.00);

        // ============================================
        // 7. Final Account Status
        // ============================================
        System.out.println("\n--- Final Account Status ---\n");

        account1.displayInfo();
        System.out.println();
        account2.displayInfo();
        System.out.println();
        account3.displayInfo();

        // ============================================
        // 8. Using toString()
        // ============================================
        System.out.println("\n--- Account Summary (toString) ---\n");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        System.out.println("\n====================================");
        System.out.println("   DEMONSTRATION COMPLETE!");
        System.out.println("====================================");
    }
}
