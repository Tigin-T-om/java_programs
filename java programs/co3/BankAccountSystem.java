// BankAccountSystem.java

abstract class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f\n", balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.printf("Savings: Deposited $%.2f. ", amount);
            displayBalance();
        } else {
            System.out.println("Savings: Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.printf("Savings: Withdrew $%.2f. ", amount);
            displayBalance();
        } else if (amount <= 0) {
            System.out.println("Savings: Withdrawal amount must be positive.");
        } else {
            System.out.println("Savings: Insufficient balance for withdrawal. ");
            displayBalance();
        }
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.printf("Savings: Interest of $%.2f applied. ", interest);
        displayBalance();
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.printf("Current: Deposited $%.2f. ", amount);
            displayBalance();
        } else {
            System.out.println("Current: Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() + overdraftLimit >= amount) {
                setBalance(getBalance() - amount);
                System.out.printf("Current: Withdrew $%.2f. ", amount);
                displayBalance();
            } else {
                System.out.println("Current: Withdrawal exceeds overdraft limit. ");
                displayBalance();
            }
        } else {
            System.out.println("Current: Withdrawal amount must be positive.");
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("--- Savings Account Operations ---");
        SavingsAccount sa = new SavingsAccount(1000.0, 2.5); // Encapsulation via constructor.
        sa.displayBalance();
        sa.deposit(200.0); // Polymorphism: calling SavingsAccount's deposit.
        sa.withdraw(300.0);
        sa.applyInterest();
        sa.withdraw(1500.0); // Insufficient balance.
        System.out.println();

        System.out.println("--- Current Account Operations ---");
        CurrentAccount ca = new CurrentAccount(500.0, 200.0); // Encapsulation via constructor.
        ca.displayBalance();
        ca.deposit(100.0); // Polymorphism: calling CurrentAccount's deposit.
        ca.withdraw(650.0); // Within overdraft limit.
        ca.withdraw(100.0); // Within overdraft limit.
        ca.withdraw(200.0); // Exceeds overdraft limit.
        System.out.println();

        System.out.println("--- Polymorphism with BankAccount reference ---");
        BankAccount acc1 = new SavingsAccount(700.0, 1.0);
        BankAccount acc2 = new CurrentAccount(300.0, 150.0);

        acc1.deposit(50.0); // Calls SavingsAccount's deposit.
        acc2.withdraw(400.0); // Calls CurrentAccount's withdraw (within overdraft).
    }
}

/*
Sample Input/Output:

--- Savings Account Operations ---
Current Balance: $1000.00
Savings: Deposited $200.00. Current Balance: $1200.00
Savings: Withdrew $300.00. Current Balance: $900.00
Savings: Interest of $22.50 applied. Current Balance: $922.50
Savings: Insufficient balance for withdrawal. 
Current Balance: $922.50

--- Current Account Operations ---
Current Balance: $500.00
Current: Deposited $100.00. Current Balance: $600.00
Current: Withdrew $650.00. Current Balance: $-50.00
Current: Withdrew $100.00. Current Balance: $-150.00
Current: Withdrawal exceeds overdraft limit. 
Current Balance: $-150.00

--- Polymorphism with BankAccount reference ---
Savings: Deposited $50.00. Current Balance: $750.00
Current: Withdrew $400.00. Current Balance: $-100.00
*/
