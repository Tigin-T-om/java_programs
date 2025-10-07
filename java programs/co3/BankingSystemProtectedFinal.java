class Account {

    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting to 0.");
        }
    }

    // Public method to get the balance (controlled access to protected field).
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account.
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposited $%.2f. ", amount);
            displayBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account.
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.printf("Withdrew $%.2f. ", amount);
            displayBalance();
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.printf("Insufficient balance for withdrawal ($%.2f requested, $%.2f available).\n", amount, this.balance);
            displayBalance();
        }
    }

    // Final method: Cannot be overridden by any subclass.
    // This demonstrates that its implementation is fixed and consistent across all account types.
    final public String getAccountType() {
        return "Generic Account";
    }

    // Helper method to display current balance.
    protected void displayBalance() {
        System.out.printf("Current Balance: $%.2f\n", this.balance);
    }
}

// Subclass: SavingsAccount inherits from Account.
// Demonstrates inheritance and specific implementations for banking operations.
class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.01; // 1% interest

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overriding deposit to add a small interest bonus.
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            super.deposit(amount); // Call parent deposit
            double interest = amount * INTEREST_RATE;
            this.balance += interest; // Direct access to protected balance
            System.out.printf("Savings: Applied interest of $%.2f on deposit. ", interest);
            displayBalance();
        } else {
            System.out.println("Savings: Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        // Example: maintain a minimum balance of 100.0 (simplified logic)
        if (amount > 0 && (this.balance - amount) >= 0) {
            super.withdraw(amount);
            System.out.println("Savings: Successfully withdrew.");
        } else if (amount <= 0) {
            System.out.println("Savings: Withdrawal amount must be positive.");
        } else {
            System.out.println("Savings: Withdrawal denied. Insufficient funds or would drop below minimum balance.");
            displayBalance();
        }
    }

    // Method to demonstrate calling the final method.
    public void showAccountType() {
        System.out.println("This is a " + getAccountType());
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw to allow overdraft up to a limit.
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            // Accessing protected balance directly.
            if (this.balance + overdraftLimit >= amount) {
                this.balance -= amount;
                System.out.printf("Current: Withdrew $%.2f. ", amount);
                displayBalance();
            } else {
                System.out.println("Current: Withdrawal exceeds overdraft limit.");
                displayBalance();
            }
        } else {
            System.out.println("Current: Withdrawal amount must be positive.");
        }
    }

    // Method to demonstrate calling the final method.
    public void showAccountType() {
        System.out.println("This is a " + getAccountType());
    }
}

public class BankingSystemProtectedFinal {
    public static void main(String[] args) {
        System.out.println("--- Savings Account Demonstration ---");
        SavingsAccount savAcc = new SavingsAccount(1000.0);
        savAcc.displayBalance();
        savAcc.deposit(100.0);
        savAcc.withdraw(500.0);
        savAcc.withdraw(700.0);
        System.out.println("Account Type: " + savAcc.getAccountType());
        System.out.println();

        System.out.println("--- Current Account Demonstration ---");
        CurrentAccount curAcc = new CurrentAccount(500.0, 200.0);
        curAcc.displayBalance();
        curAcc.deposit(50.0);
        curAcc.withdraw(600.0);
        curAcc.withdraw(200.0);
        System.out.println("Account Type: " + curAcc.getAccountType());
        System.out.println();

    }
}