package JavaPolmyorphism;

/*
Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount.
Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
*/

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount{
    private double withdrawalLimit;

    public SavingsAccount(double balance, double withdrawalLimit){
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= withdrawalLimit){
            super.withdraw(amount);
        } else{
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class CheckingAccount extends BankAccount{
    private double overdraftFee;

    public CheckingAccount(double balance, double overdraftFee){
        super(balance);
        this.overdraftFee = overdraftFee;
    }

    public double getOverdraftFee(){
        return overdraftFee;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= getBalance()){
            super.withdraw(amount);
        } else{
            System.out.println("\nOverdraft fee applied.");
            super.withdraw(amount + overdraftFee);
        }
    }
}

public class Zad9 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(2000, 500);
        CheckingAccount checkingAccount = new CheckingAccount(1000, 100);
        double amount1 = 300;
        double amount2 = 1100;

        System.out.println("Savings account balance: " + savingsAccount.getBalance());
        System.out.println("Savings account withdrawal limit: " + savingsAccount.getWithdrawalLimit());

        System.out.println("\nChecking account balance: " + checkingAccount.getBalance());
        System.out.println("Checking account overdraft fee: " +  checkingAccount.getOverdraftFee());

        withdrawFromAccount(savingsAccount, amount1);
        System.out.println("\nWithdrawing from savings account: " + amount1 + "$");
        withdrawFromAccount(checkingAccount, amount2);
        System.out.println("Withdrawing from checking account: " + amount2 + "$");

        System.out.println("\nSavings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    public static void withdrawFromAccount(BankAccount bankAccount, double amount) {
        bankAccount.withdraw(amount);
    }
}
