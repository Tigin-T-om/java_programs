// BankAccessControl.java

// Class BankAccount demonstrates access control modifiers: private, public, and protected.
class BankAccount {
    // private: accessible only within this class.
    private double balance;

    // Constructor to initialize the account balance.
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting to 0.");
        }
    }

    // public: accessible from anywhere.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // public: accessible from anywhere.
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance for withdrawal. Current balance: " + balance);
        }
    }

    // protected: accessible within this class, by subclasses, and within the same package.
    protected double checkBalance() {
        return balance;
    }

    // Public method to display balance, often used to expose protected method functionality safely.
    public void displayBalance() {
        System.out.println("Current balance (via public method): " + checkBalance());
    }
}

// Subclass to demonstrate protected access.
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Method in subclass to access protected checkBalance method.
    public void showProtectedBalance() {
        System.out.println("Savings Account Balance (via protected access in subclass): " + checkBalance());
    }
}

// Another class to demonstrate access to methods of BankAccount.
public class BankAccessControl {
    public static void main(String[] args) {
        // Demonstrate BankAccount functionality.
        System.out.println("--- Demonstrating BankAccount ---");
        BankAccount account1 = new BankAccount(1000.0);
        account1.displayBalance();

        account1.deposit(200.0);
        account1.withdraw(500.0);
        account1.withdraw(800.0); // Insufficient balance
        account1.displayBalance();
        System.out.println();

        // Attempting to access private balance directly would cause a compile-time error:
        // System.out.println(account1.balance);

        // Demonstrate SavingsAccount (subclass) functionality.
        System.out.println("--- Demonstrating SavingsAccount (subclass) ---");
        SavingsAccount savings1 = new SavingsAccount(5000.0);
        savings1.displayBalance(); // Inherited public method
        savings1.showProtectedBalance(); // Access protected method via subclass method
        savings1.deposit(100.0);
        savings1.showProtectedBalance();
    }
}

/*
Sample Input/Output:

--- Demonstrating BankAccount ---
Current balance (via public method): 1000.0
Deposited: 200.0. New balance: 1200.0
Withdrew: 500.0. New balance: 700.0
Insufficient balance for withdrawal. Current balance: 700.0
Current balance (via public method): 700.0

--- Demonstrating SavingsAccount (subclass) ---
Current balance (via public method): 5000.0
Savings Account Balance (via protected access in subclass): 5000.0
Deposited: 100.0. New balance: 5100.0
Savings Account Balance (via protected access in subclass): 5100.0
*/
