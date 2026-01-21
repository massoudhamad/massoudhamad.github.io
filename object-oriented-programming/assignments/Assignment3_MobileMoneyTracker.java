/**
 * ASSIGNMENT 3: Mobile Money Transaction Tracker (M-Pesa/Tigo Pesa/Airtel Money)
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 * Total Marks: 100
 *
 * ============================================================
 * ASSIGNMENT OVERVIEW:
 * ============================================================
 *
 * Create a mobile money tracking system using YOUR REAL transaction history.
 * Export your last 30 days of transactions and analyze them using OOP.
 *
 * THIS ASSIGNMENT REQUIRES YOUR ACTUAL MOBILE MONEY DATA.
 *
 * ============================================================
 * REQUIREMENTS:
 * ============================================================
 *
 * PART A: Transaction Class (20 marks)
 * Create a Transaction class with:
 * 1. Private attributes:
 *    - transactionId (String)
 *    - date (String)
 *    - time (String)
 *    - type (String) - "SEND", "RECEIVE", "PAY_BILL", "BUY_AIRTIME", "WITHDRAW", "DEPOSIT"
 *    - amount (double)
 *    - recipientOrSender (String) - name or number
 *    - balance (double) - balance after transaction
 *    - transactionCost (double) - fee charged
 *
 * 2. Methods:
 *    - isIncoming() - returns true if money received
 *    - isOutgoing() - returns true if money sent
 *    - getNetAmount() - amount minus transaction cost
 *    - toString() - formatted transaction details
 *
 * PART B: MobileMoneyAccount Class (25 marks)
 * Create an account class with:
 * 1. Private attributes:
 *    - accountHolder (String) - YOUR NAME
 *    - phoneNumber (String) - YOUR NUMBER
 *    - provider (String) - "M-Pesa", "Tigo Pesa", "Airtel Money"
 *    - transactions (ArrayList<Transaction>)
 *
 * 2. Methods:
 *    - addTransaction(Transaction t)
 *    - getTotalReceived() - sum of all incoming
 *    - getTotalSent() - sum of all outgoing
 *    - getTotalFees() - sum of all transaction costs
 *    - getTransactionsByType(String type)
 *    - getTransactionsByDateRange(String start, String end)
 *    - getMostFrequentRecipient()
 *    - getHighestTransaction()
 *    - generateMonthlyReport()
 *
 * PART C: Analytics Dashboard (30 marks)
 * Create an analysis system that shows:
 * 1. Total money received vs sent (with pie chart representation using text)
 * 2. Daily spending patterns
 * 3. Category breakdown (bills, airtime, transfers, etc.)
 * 4. Top 5 people you transact with most
 * 5. Average transaction size
 * 6. Total fees paid to mobile money provider
 * 7. Spending trends (increasing/decreasing)
 *
 * PART D: Personal Data Entry (25 marks)
 * 1. Enter at least 20 REAL transactions from your M-Pesa/Tigo Pesa
 * 2. Transactions must span at least 2 weeks
 * 3. Include variety of transaction types
 * 4. Amounts must be realistic (TSh 500 - TSh 500,000 range)
 *
 * ============================================================
 * EXAMPLE MONTHLY REPORT:
 * ============================================================
 *
 *    ╔════════════════════════════════════════════════════════╗
 *    ║         MOBILE MONEY MONTHLY REPORT                    ║
 *    ║         [Your Provider] - [Your Number]                ║
 *    ╠════════════════════════════════════════════════════════╣
 *    ║  Account Holder: [Your Full Name]                      ║
 *    ║  Period: [Start Date] to [End Date]                    ║
 *    ║  Total Transactions: XX                                ║
 *    ╠════════════════════════════════════════════════════════╣
 *    ║                                                        ║
 *    ║  MONEY FLOW:                                           ║
 *    ║  ├── Received:  TSh XXX,XXX  ████████████░░ (60%)     ║
 *    ║  └── Sent:      TSh XXX,XXX  ████████░░░░░░ (40%)     ║
 *    ║                                                        ║
 *    ║  TRANSACTION BREAKDOWN:                                ║
 *    ║  ├── Send Money:     XX transactions (TSh XXX,XXX)    ║
 *    ║  ├── Receive Money:  XX transactions (TSh XXX,XXX)    ║
 *    ║  ├── Pay Bills:      XX transactions (TSh XXX,XXX)    ║
 *    ║  ├── Buy Airtime:    XX transactions (TSh XXX,XXX)    ║
 *    ║  └── Withdraw:       XX transactions (TSh XXX,XXX)    ║
 *    ║                                                        ║
 *    ║  TOP 5 RECIPIENTS:                                     ║
 *    ║  1. [Name/Number] - XX transactions (TSh XXX,XXX)     ║
 *    ║  2. [Name/Number] - XX transactions (TSh XXX,XXX)     ║
 *    ║  ...                                                   ║
 *    ║                                                        ║
 *    ║  FEES ANALYSIS:                                        ║
 *    ║  Total Fees Paid: TSh X,XXX                           ║
 *    ║  Average Fee: TSh XXX per transaction                 ║
 *    ║                                                        ║
 *    ╚════════════════════════════════════════════════════════╝
 *
 * ============================================================
 * SUBMISSION:
 * ============================================================
 * - Transaction.java
 * - MobileMoneyAccount.java
 * - TransactionAnalyzer.java (main)
 * - Screenshot of your actual M-Pesa/Tigo Pesa statement (for verification)
 * - Program output showing YOUR transaction analysis
 *
 * NOTE: Transaction details (amounts, recipients) will be verified.
 * Fake data results in automatic ZERO.
 */

public class Assignment3_MobileMoneyTracker {
    public static void main(String[] args) {
        System.out.println("Implement the mobile money tracker with YOUR real transactions.");
        System.out.println("You need: Transaction.java, MobileMoneyAccount.java, TransactionAnalyzer.java");
    }
}
