package org.example.singleprinciple;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class TransactionLogger {
    public void logTransaction(String accountNumber, String transactionType, double amount) {
        // Log the transaction details to a file or database
        System.out.println("Logged " + transactionType + " transaction for account " + accountNumber + ": $" + amount);
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        Account savingsAccount = new Account("S12345");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);

        TransactionLogger logger = new TransactionLogger();
        logger.logTransaction(savingsAccount.getAccountNumber(), "withdrawal", 500);
        System.out.println("Savings account balance: $" + savingsAccount.getBalance());

    }
}
