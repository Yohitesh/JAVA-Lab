import java.util.Scanner;

class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Balance for " + customerName + ": " + balance);
    }
}

class Sav_acct extends Account {
    double interestRate = 0.05; 
    public Sav_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class Cur_acct extends Account {
    double minimumBalance = 500;
    double serviceCharge = 50;
    public Cur_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Balance below minimum. Service charge of " + serviceCharge + " imposed.");
            }
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1BM23CS085, Dama Yohitesh Naveen Sai\n");        

        System.out.println("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("\nCustomer " + (i + 1) + ":");

            System.out.println("Choose account type: 1 for Savings, 2 for Current");
            int ch = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter account number: ");
            String accNum = scanner.nextLine();

            System.out.print("Enter initial deposit: ");
            double initialDeposit = scanner.nextDouble();

            switch (ch) {
                case 1:
                    Sav_acct savings = new Sav_acct(name, accNum, initialDeposit);
                    savings.displayBalance();
                    System.out.print("Enter deposit amount: ");
                    savings.deposit(scanner.nextDouble());
                    savings.computeAndDepositInterest();
                    System.out.print("Enter withdrawal amount: ");
                    savings.withdraw(scanner.nextDouble());
                    savings.displayBalance();
                    break;
                case 2:
                    Cur_acct current = new Cur_acct(name, accNum, initialDeposit);
                    current.displayBalance();
                    System.out.print("Enter deposit amount: ");
                    current.deposit(scanner.nextDouble());
                    System.out.print("Enter withdrawal amount: ");
                    current.withdraw(scanner.nextDouble());
                    current.displayBalance();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
