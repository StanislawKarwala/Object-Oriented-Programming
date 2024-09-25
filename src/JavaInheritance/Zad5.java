package JavaInheritance;

/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
*/

class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        } else{
            System.out.println("Insufficent balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount < 100){
            System.out.println("Minimum balance required is 100");
        } else{
            super.withdraw(amount);
        }
    }
}
public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Creating a Bank account with number: 690192, and balance 500");
        BankAccount bkAcc = new BankAccount("690192", 500);

        System.out.println("Depositing 500");
        bkAcc.deposit(500);
        System.out.println("Balance: " + bkAcc.getBalance());

        System.out.println("Withdrawing 901");
        bkAcc.withdraw(901);
        System.out.println("Balance: " + bkAcc.getBalance());

        System.out.println("Withdrawing 90");
        bkAcc.withdraw(90);
        System.out.println("Balance: " + bkAcc.getBalance());

        System.out.println("\nCreating a Saving account with number: 123456, and balance 200");
        SavingsAccount saveacc = new SavingsAccount("123456", 200);

        System.out.println("Depositing 100");
        saveacc.deposit(100);
        System.out.println("Balance: " + saveacc.getBalance());

        System.out.println("Withdrawing 270");
        saveacc.withdraw(270);
        System.out.println("Balance: " + saveacc.getBalance());

        System.out.println("Withdrawing 10");
        saveacc.withdraw(10);
        System.out.println("Balance: " + saveacc.getBalance());


    }
}
