import java.util.Scanner;

// Class representing a BankAccount
class BankAccount {
    // Static variable to keep track of the number of bank accounts created
    private static int accountCount = 0;
    
    // Instance variables for account details
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize a new bank account
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Generate a simple account number. In a real system, this would be more robust.
        this.accountNumber = "ACC" + (++accountCount);
        this.balance = initialBalance;
        System.out.println("Account created for " + accountHolder + " with Account Number: " + accountNumber);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited to " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from " + accountNumber + ". New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance in " + accountNumber + ". Current balance: " + balance);
            return false;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Static method to get the total number of accounts created
    public static int getAccountCount() {
        return accountCount;
    }
}

// Class representing a Transaction between accounts
class Transaction {
    private String fromAccount;
    private String toAccount;
    private double amount;
    private String status;

    // Constructor for a transaction
    public Transaction(String fromAccount, String toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    // Method to display transaction details
    public void displayTransaction() {
        System.out.println("\n--- Transaction Details ---");
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }

    // Method to perform a transfer between two BankAccount objects
    public static Transaction transferTo(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            return new Transaction(from.getAccountNumber(), to.getAccountNumber(), amount, "Success");
        } else {
            return new Transaction(from.getAccountNumber(), to.getAccountNumber(), amount, "Failed - Insufficient Funds");
        }
    }
}

// Main class to demonstrate BankAccount and Transaction functionalities
public class BankAccountPassbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total accounts before creation: " + BankAccount.getAccountCount());

        // Create accounts
        System.out.println("\n--- Creating Accounts ---");
        BankAccount account1 = new BankAccount("Alice Smith", 1000.0);
        BankAccount account2 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("Total accounts after creation: " + BankAccount.getAccountCount());

        // Perform deposits
        System.out.println("\n--- Performing Deposits ---");
        account1.deposit(200.0);
        account2.deposit(150.0);

        // Perform withdrawals
        System.out.println("\n--- Performing Withdrawals ---");
        account1.withdraw(50.0); // Successful withdrawal
        account2.withdraw(700.0); // Failed withdrawal (insufficient balance)

        // Display balances
        System.out.println("\n--- Current Balances ---");
        System.out.println(account1.getAccountHolder() + " (Account: " + account1.getAccountNumber() + ") Balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " (Account: " + account2.getAccountNumber() + ") Balance: " + account2.getBalance());

        // Perform transfers
        System.out.println("\n--- Performing Transfers ---");
        Transaction transaction1 = Transaction.transferTo(account1, account2, 300.0); // Successful transfer
        transaction1.displayTransaction();

        Transaction transaction2 = Transaction.transferTo(account2, account1, 1000.0); // Failed transfer
        transaction2.displayTransaction();

        // Display balances after transfers
        System.out.println("\n--- Balances After Transfers ---");
        System.out.println(account1.getAccountHolder() + " (Account: " + account1.getAccountNumber() + ") Balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " (Account: " + account2.getAccountNumber() + ") Balance: " + account2.getBalance());

        scanner.close();
    }
}

/*
Sample Input/Output:

Total accounts before creation: 0

--- Creating Accounts ---
Account created for Alice Smith with Account Number: ACC1
Account created for Bob Johnson with Account Number: ACC2
Total accounts after creation: 2

--- Performing Deposits ---
200.0 deposited to ACC1. New balance: 1200.0
150.0 deposited to ACC2. New balance: 650.0

--- Performing Withdrawals ---
50.0 withdrawn from ACC1. New balance: 1150.0
Insufficient balance in ACC2. Current balance: 650.0

--- Current Balances ---
Alice Smith (Account: ACC1) Balance: 1150.0
Bob Johnson (Account: ACC2) Balance: 650.0

--- Performing Transfers ---
300.0 withdrawn from ACC1. New balance: 850.0
300.0 deposited to ACC2. New balance: 950.0

--- Transaction Details ---
From Account: ACC1
To Account: ACC2
Amount: 300.0
Status: Success
---------------------------
Insufficient balance in ACC2. Current balance: 950.0

--- Transaction Details ---
From Account: ACC2
To Account: ACC1
Amount: 1000.0
Status: Failed - Insufficient Funds
---------------------------

--- Balances After Transfers ---
Alice Smith (Account: ACC1) Balance: 850.0
Bob Johnson (Account: ACC2) Balance: 950.0
*/


