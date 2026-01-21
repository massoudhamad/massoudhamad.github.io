/**
 * BankAccount.java - Homework Assignment Solution
 * PT821: Object-Oriented Programming
 * Lecture 3: Classes and Objects
 *
 * This class demonstrates a practical implementation of a BankAccount
 * with proper encapsulation, validation, and multiple behaviors.
 */
public class BankAccount {
    // ============================================
    // ATTRIBUTES
    // ============================================
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String accountType;  // "Savings" or "Current"
    private boolean isActive;

    // Static counter for generating account numbers
    private static int accountCounter = 1000;

    // ============================================
    // CONSTRUCTORS
    // ============================================

    /**
     * Default Constructor
     * Creates an empty savings account
     */
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.ownerName = "Unknown";
        this.balance = 0.0;
        this.accountType = "Savings";
        this.isActive = true;
    }

    /**
     * Parameterized Constructor
     * @param ownerName The name of the account owner
     * @param initialDeposit The initial deposit amount
     * @param accountType The type of account (Savings/Current)
     */
    public BankAccount(String ownerName, double initialDeposit, String accountType) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = (initialDeposit > 0) ? initialDeposit : 0.0;
        this.accountType = validateAccountType(accountType);
        this.isActive = true;
    }

    /**
     * Copy Constructor
     * Creates a new account with same details but different account number
     * Note: Balance is NOT copied for security reasons
     */
    public BankAccount(BankAccount other) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = other.ownerName;
        this.balance = 0.0;  // Security: don't copy balance
        this.accountType = other.accountType;
        this.isActive = true;
    }

    // ============================================
    // PRIVATE HELPER METHODS
    // ============================================

    /**
     * Generates a unique account number
     * @return The generated account number
     */
    private String generateAccountNumber() {
        accountCounter++;
        return "ACC" + accountCounter;
    }

    /**
     * Validates the account type
     * @param type The account type to validate
     * @return Valid account type or default to "Savings"
     */
    private String validateAccountType(String type) {
        if (type != null && (type.equalsIgnoreCase("Savings") || type.equalsIgnoreCase("Current"))) {
            return type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
        }
        return "Savings";
    }

    // ============================================
    // GETTERS
    // ============================================

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean isActive() {
        return isActive;
    }

    // ============================================
    // SETTERS with Validation
    // ============================================

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Error: Owner name cannot be empty!");
        }
    }

    public void setAccountType(String accountType) {
        this.accountType = validateAccountType(accountType);
    }

    // ============================================
    // BANKING OPERATIONS
    // ============================================

    /**
     * Deposits money into the account
     * @param amount The amount to deposit
     * @return true if deposit was successful
     */
    public boolean deposit(double amount) {
        if (!isActive) {
            System.out.println("Error: Account is inactive!");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive!");
            return false;
        }

        balance += amount;
        System.out.println("SUCCESS: Deposited TZS " + String.format("%.2f", amount));
        System.out.println("New Balance: TZS " + String.format("%.2f", balance));
        return true;
    }

    /**
     * Withdraws money from the account
     * @param amount The amount to withdraw
     * @return true if withdrawal was successful
     */
    public boolean withdraw(double amount) {
        if (!isActive) {
            System.out.println("Error: Account is inactive!");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
            return false;
        }

        if (amount > balance) {
            System.out.println("Error: Insufficient funds!");
            System.out.println("Available Balance: TZS " + String.format("%.2f", balance));
            System.out.println("Requested Amount: TZS " + String.format("%.2f", amount));
            return false;
        }

        // Minimum balance check for savings accounts
        if (accountType.equals("Savings") && (balance - amount) < 1000) {
            System.out.println("Error: Savings account must maintain minimum balance of TZS 1000.00");
            return false;
        }

        balance -= amount;
        System.out.println("SUCCESS: Withdrew TZS " + String.format("%.2f", amount));
        System.out.println("Remaining Balance: TZS " + String.format("%.2f", balance));
        return true;
    }

    /**
     * Transfers money to another account
     * @param recipient The account to transfer to
     * @param amount The amount to transfer
     * @return true if transfer was successful
     */
    public boolean transfer(BankAccount recipient, double amount) {
        if (recipient == null) {
            System.out.println("Error: Invalid recipient account!");
            return false;
        }

        if (this.accountNumber.equals(recipient.accountNumber)) {
            System.out.println("Error: Cannot transfer to the same account!");
            return false;
        }

        if (!recipient.isActive) {
            System.out.println("Error: Recipient account is inactive!");
            return false;
        }

        System.out.println("\n--- Processing Transfer ---");
        System.out.println("From: " + this.accountNumber + " (" + this.ownerName + ")");
        System.out.println("To: " + recipient.accountNumber + " (" + recipient.ownerName + ")");
        System.out.println("Amount: TZS " + String.format("%.2f", amount));

        // Withdraw from this account
        if (this.withdraw(amount)) {
            // Deposit to recipient account
            recipient.balance += amount;  // Direct access within same class
            System.out.println("SUCCESS: Transfer completed!");
            System.out.println("Recipient's new balance: TZS " + String.format("%.2f", recipient.balance));
            return true;
        }

        System.out.println("FAILED: Transfer could not be completed.");
        return false;
    }

    /**
     * Checks the account balance
     */
    public void checkBalance() {
        System.out.println("\n--- Account Balance ---");
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: TZS " + String.format("%.2f", balance));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }

    /**
     * Deactivates the account
     */
    public void deactivate() {
        if (balance > 0) {
            System.out.println("Warning: Please withdraw remaining balance before deactivation.");
            System.out.println("Current Balance: TZS " + String.format("%.2f", balance));
            return;
        }
        isActive = false;
        System.out.println("Account " + accountNumber + " has been deactivated.");
    }

    /**
     * Reactivates the account
     */
    public void activate() {
        isActive = true;
        System.out.println("Account " + accountNumber + " has been reactivated.");
    }

    /**
     * Displays full account information
     */
    public void displayInfo() {
        System.out.println("================================");
        System.out.println("     ACCOUNT INFORMATION       ");
        System.out.println("================================");
        System.out.println("Account No:  " + accountNumber);
        System.out.println("Owner:       " + ownerName);
        System.out.println("Type:        " + accountType);
        System.out.println("Balance:     TZS " + String.format("%.2f", balance));
        System.out.println("Status:      " + (isActive ? "Active" : "Inactive"));
        System.out.println("================================");
    }

    /**
     * String representation of the account
     */
    public String toString() {
        return "BankAccount[" + accountNumber + " - " + ownerName + " - TZS " + String.format("%.2f", balance) + "]";
    }
}
