import java.util.ArrayList;
import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: $" + initialBalance);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: $" + amount);
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: $" + amount);
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Show transaction history
    public void showTransactions() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

// Main

