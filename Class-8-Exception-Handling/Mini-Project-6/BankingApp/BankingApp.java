import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        BankAccount account = new BankAccount(initialBalance);

        try {
            System.out.print("Enter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter the amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("Transaction completed successfully.");
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occurred.");
        } finally {
            System.out.println("Current balance: " + account.getBalance());
            scanner.close();
        }
    }
}
