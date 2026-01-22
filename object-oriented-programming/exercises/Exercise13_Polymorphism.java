/**
 * Exercise 13: Polymorphism - Banking System
 * PT821 - Object-Oriented Programming
 * State University of Zanzibar (SUZA)
 *
 * INSTRUCTIONS:
 * Complete the following exercise to practice polymorphism concepts.
 * Follow the TODO comments and implement the required functionality.
 */

// ============================================
// EXERCISE: Create a Banking System
// ============================================

/*
 * TODO 1: Create a base class called "BankAccount" with:
 * - Protected attributes: accountNumber (String), accountHolder (String), balance (double)
 * - Constructor that initializes all attributes
 * - Method: deposit(double amount) - adds to balance
 * - Method: withdraw(double amount) - subtracts from balance (check if sufficient)
 * - Method: getBalance() - returns current balance
 * - Method: displayAccountInfo() - shows account details
 * - Method: calculateInterest() - returns 0 (base implementation)
 */

// Write your BankAccount class here:


/*
 * TODO 2: Create a class "SavingsAccount" that extends BankAccount with:
 * - Private attribute: interestRate (double, e.g., 0.05 for 5%)
 * - Constructor that calls super() and sets interest rate
 * - Override calculateInterest() to return balance * interestRate
 * - Override withdraw() to enforce minimum balance of TZS 10,000
 * - Method: applyInterest() - adds calculated interest to balance
 */

// Write your SavingsAccount class here:


/*
 * TODO 3: Create a class "CurrentAccount" that extends BankAccount with:
 * - Private attribute: overdraftLimit (double)
 * - Constructor that calls super() and sets overdraft limit
 * - Override withdraw() to allow withdrawal up to (balance + overdraftLimit)
 * - Override calculateInterest() to return 0 (no interest on current accounts)
 * - Method: isOverdrawn() - returns true if balance is negative
 */

// Write your CurrentAccount class here:


/*
 * TODO 4: Create a class "FixedDepositAccount" that extends BankAccount with:
 * - Private attributes: interestRate (double), maturityMonths (int), isMatured (boolean)
 * - Constructor that calls super() and sets interest rate and maturity period
 * - Override calculateInterest() to return balance * interestRate * (maturityMonths/12)
 * - Override withdraw() to only allow withdrawal if matured (print error otherwise)
 * - Method: checkMaturity() - checks and updates isMatured status
 * - Method: getMaturityAmount() - returns balance + calculated interest
 */

// Write your FixedDepositAccount class here:


/*
 * TODO 5: Create a "Bank" class with:
 * - Private array: accounts (BankAccount[])
 * - Method: addAccount(BankAccount account)
 * - Method: getTotalDeposits() - sum of all account balances
 * - Method: getTotalInterest() - sum of all calculated interest (polymorphism!)
 * - Method: displayAllAccounts() - shows all account info
 */

// Write your Bank class here:


/*
 * TODO 6: Create the main class with method overloading
 */

public class Exercise13_Polymorphism {

    // TODO: Create overloaded methods for transferMoney:
    // - transferMoney(BankAccount from, BankAccount to, double amount)
    // - transferMoney(BankAccount from, BankAccount to, double amount, String description)
    // - transferMoney(BankAccount from, String toAccountNumber, double amount, Bank bank)

    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM TEST ===\n");

        // TODO: Create different types of accounts
        // SavingsAccount savings = new SavingsAccount("SAV001", "Ali Hassan", 500000, 0.05);
        // CurrentAccount current = new CurrentAccount("CUR001", "Fatma Said", 1000000, 500000);
        // FixedDepositAccount fixed = new FixedDepositAccount("FD001", "Omar Juma", 2000000, 0.08, 12);

        // TODO: Test deposit and withdrawal for each account type
        // System.out.println("--- Testing Savings Account ---");
        // savings.displayAccountInfo();
        // savings.deposit(100000);
        // savings.withdraw(50000);
        // savings.applyInterest();
        // System.out.println("Interest earned: TZS " + savings.calculateInterest());
        // savings.displayAccountInfo();

        // System.out.println("\n--- Testing Current Account ---");
        // current.displayAccountInfo();
        // current.withdraw(1200000);  // Should use overdraft
        // System.out.println("Is overdrawn? " + current.isOverdrawn());
        // current.displayAccountInfo();

        // System.out.println("\n--- Testing Fixed Deposit ---");
        // fixed.displayAccountInfo();
        // fixed.withdraw(500000);  // Should fail - not matured
        // System.out.println("Maturity amount: TZS " + fixed.getMaturityAmount());

        // TODO: Create a Bank and add all accounts
        // Bank bank = new Bank(10);
        // bank.addAccount(savings);
        // bank.addAccount(current);
        // bank.addAccount(fixed);

        // TODO: Test polymorphic behavior
        // System.out.println("\n--- Bank Summary (Polymorphism) ---");
        // bank.displayAllAccounts();
        // System.out.println("Total Deposits: TZS " + bank.getTotalDeposits());
        // System.out.println("Total Interest: TZS " + bank.getTotalInterest());

        // TODO: Test method overloading with transfers
        // System.out.println("\n--- Testing Transfers (Overloading) ---");
        // transferMoney(savings, current, 50000);
        // transferMoney(current, savings, 30000, "Rent payment");

        System.out.println("\n=== END OF TEST ===");
    }
}

/*
 * BONUS CHALLENGE:
 *
 * 1. Add a "StudentAccount" class with:
 *    - No minimum balance requirement
 *    - Higher interest rate (7%)
 *    - Maximum withdrawal limit of TZS 50,000 per day
 *
 * 2. Add a "JointAccount" class with:
 *    - Two account holders
 *    - Requires approval from both for large withdrawals (>500,000)
 *
 * EXPECTED OUTPUT (partial):
 *
 * === BANKING SYSTEM TEST ===
 *
 * --- Testing Savings Account ---
 * Account Number: SAV001
 * Account Holder: Ali Hassan
 * Balance: TZS 500,000.00
 * Account Type: Savings
 * Deposited TZS 100,000.00. New balance: TZS 600,000.00
 * Withdrew TZS 50,000.00. New balance: TZS 550,000.00
 * Interest of TZS 27,500.00 applied. New balance: TZS 577,500.00
 *
 * ... (more output)
 *
 * SUBMISSION:
 * - Complete all TODO sections
 * - Test your code thoroughly
 * - Submit the completed .java file
 */
