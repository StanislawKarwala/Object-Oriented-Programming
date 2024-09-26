package JavaEncapsulation;

/*
Write a Java program to create a class called Account with private instance variables accountNumber, accountHolder, and balance.
Provide public getter and setter methods to access and modify these variables.
Add a method called deposit() that takes an amount and increases the balance by that amount,
and a method called withdraw() that takes an amount and decreases the balance by that amount.
*/

class Account{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
        } else{
            System.out.println("You have no enough money in your account");
        }
    }
}

public class Zad12 {
    public static void main(String[] args) {
        Account account = new Account();
        double deposit = 100;
        double withdraw = 1000;
        double withdraw2 = 200;

        account.setAccountHolder("Nobody");
        account.setAccountNumber("1029384756");
        account.setBalance(1000);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account balance: " + account.getBalance() + "$");

        System.out.println("\nDepositing " + deposit + "$ to account");
        account.deposit(deposit);
        System.out.println("Account after deposit: " + account.getBalance() + "$");

        System.out.println("\nWithdrawing: " + withdraw + "$ from account");
        account.withdraw(withdraw);
        System.out.println("Account after withdraw: " + account.getBalance() + "$");

        System.out.println("\nWithdrawing: " + withdraw2 + "$ from account");
        account.withdraw(withdraw2);

    }
}
