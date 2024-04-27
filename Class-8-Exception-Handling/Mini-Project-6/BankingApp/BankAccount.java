// BankAccount class to manage account balance
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money, may throw an InsufficientBalanceException
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
        balance -= amount;   // balance = balance - amount
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}