//first class
import java.util.Scanner;
public class TaskThree {
    private BankAccount bankAccount;

    public TaskThree(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void run() {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (bankAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful");
                    break;
                case 3:
                    double balance = bankAccount.getBalance();
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using the ATM");
        input.close();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance of 1000
        TaskThree taskThree = new TaskThree(userAccount);
        taskThree.run();
    }
}

/*class for task three*/
public class BankAccount
{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}


