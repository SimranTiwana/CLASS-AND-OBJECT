import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount+" Remaining Balance: "+balance);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter account holder name: ");
        b.accountHolder = sc.next();

        System.out.print("Enter account number: ");
        b.accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        b.balance = sc.nextDouble();

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                b.deposit();
                break;
            case 2:
                b.withdraw();
                break;
            case 3:
                b.displayBalance();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
