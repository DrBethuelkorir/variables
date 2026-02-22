import java.util.Scanner;

public class App {
   
    static Scanner scanner = new Scanner(System.in);
   
    static double balance = 0;

    
    static double deposit() {
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposited: $" + amount);
        return balance;
    }
    
    static double withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if(balance < amount) {
            System.out.println("Insufficient funds");
            return balance;
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return balance;
        }
    }
    
    static double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("Enter your option: ");
        
        int option = scanner.nextInt();

        if(option == 1) {
            deposit();
            System.out.println("Your new balance is: $" + getBalance());
        } else if(option == 2) {
            withdraw();
            System.out.println("Your new balance is: $" + getBalance());
        } else if(option == 3) {
            System.out.println("Your balance is: $" + getBalance());
        } else {
            System.out.println("Invalid option");
        }
        
        scanner.close(); // Good practice to close the scanner
    }
}