package JavaAbstractClasses;

/*
Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
*/

abstract class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class Zad3 {
    public static void main(String[] args) {
        String accountNumber = "AC10452";
        double balance = 1000;
        double deposit = 300;
        double withdraw = 200;

        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance);
        System.out.println("Savings of account: " + accountNumber + ": Initial Balace: $" + balance);

        savingsAccount.deposit(deposit);
        savingsAccount.withdraw(withdraw);
        withdraw = 2000;

        System.out.println("Try to withdraw: $" + withdraw);
        savingsAccount.withdraw(withdraw);
    }
}
