import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Updated Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}