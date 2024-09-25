package JavaEncapsulation;

/*
Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.
*/

class BankAccount{
    private String accountNumber;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

public class Zad2 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setAccountNumber("RPK11123");
        bank.setBalance(150.14);

        System.out.println("Account number: " + bank.getAccountNumber());
        System.out.println("Account balance: " + bank.getBalance());
    }
}
