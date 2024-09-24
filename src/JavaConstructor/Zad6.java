package JavaConstructor;

/*
Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance.
Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
*/

public class Zad6 {
    private String accountNumber;
    private double balance;

    public Zad6(String accountNumber, double balance){
        if(accountNumber == null || accountNumber.isEmpty()){
            System.err.println("Error: Account number should be non-null and non-empty");
            return;
        }

        if(balance < 0){
            System.err.println("Error: Balance should be non-negative");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public static void main(String[] args) {
        Zad6 account = new Zad6("6666232", -1);
        System.out.println("Account 1 Number: " + account.accountNumber);
        System.out.println("Account 1 Balance: " + account.balance);

        Zad6 account1 = new Zad6("15243612", 1);
        System.out.println("\nAccount 2 Number: " + account1.accountNumber);
        System.out.println("Account 2 Balance: " + account1.balance);

        Zad6 account2 = new Zad6("", 1);
        System.out.println("\nAccount 3 Number: " + account2.accountNumber);
        System.out.println("Account 3 Balance: " + account2.balance);


    }
}
