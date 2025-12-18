
public class BankingInformationSystem {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankingInformationSystem(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        BankingInformationSystem account =
                new BankingInformationSystem("Shalini K", "ACC12345", 10000);

        account.displayAccountDetails();
        account.deposit(5000);
        account.withdraw(3000);
        account.displayAccountDetails();
    }
}
