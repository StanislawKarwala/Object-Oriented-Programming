package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer.
*/

import java.util.ArrayList;
import java.util.List;

class Bank{
    private List<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("New account has been added");
    }

    public void removeAccount(int accountNumber){
        Account accountToRemove = null;
        for(Account acc : accounts){
            if(acc.getAccountNumber() == accountNumber){
                accountToRemove = acc;
                break;
            }
        }
        if(accountToRemove != null){
            accounts.remove(accountToRemove);
            System.out.println("\nAccount " + accountToRemove.getAccountNumber() + " removed");
        } else{
            System.out.println("Account with this number: " + accountNumber + " wasn't found");
        }
    }

    public void displayAccounts(){
        if(accounts.isEmpty()){
            System.out.println("There are no accounts in bank");
        } else{
            System.out.println("\nAccounts in bank: ");
            for(Account acc : accounts){
                System.out.println(acc);
            }
        }
    }
}

class Account{
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        return "Account owner: " + name + ", number: " + accountNumber + ", balance: " + balance;
    }
}

public class Zad7 {
    public static void main(String[] args) {
        int accountNumber = 123456;
        Bank bank = new Bank();
        Account acc = new Account("John", 123456, 5000);
        Account acc1 = new Account("Johnv2", 654321, 2500);
        bank.addAccount(acc);
        bank.addAccount(acc1);
        bank.displayAccounts();

        bank.removeAccount(accountNumber);
        bank.displayAccounts();

    }
}
