package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance.
Include methods for depositing and withdrawing money, as well as checking the balance.
Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
*/

class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient founds on account");
        } else{
            balance -= amount;
        }
    }

    public double checkBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }
}

public class Zad20 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123", "Stanley", 1000);
        SavingsAccount sacc = new SavingsAccount("11", "John", 1000, 8);
        System.out.println("Bank Account balance: " + acc.checkBalance());

        System.out.println("\nDeposit 100$");
        acc.deposit(100);
        System.out.println("Bank Account balance: " + acc.checkBalance());

        System.out.println("\nWithdrawing 900$");
        acc.withdraw(900);
        System.out.println("Bank Account balance: " + acc.checkBalance());

        System.out.println("\nWithdrawing 201$");
        acc.withdraw(201);
        System.out.println("Bank Account balance: " + acc.checkBalance());

        System.out.println("\nSavings Account balance: " + sacc.checkBalance());
        sacc.applyInterest();
    }
}
