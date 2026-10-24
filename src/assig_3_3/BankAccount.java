
package assig_3_3;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor 1: Initialize all fields
    public BankAccount(String accountHolder,
                       String accountNumber,
                       double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative"
            );
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor 2: Initialize only holder and number
    public BankAccount(String accountHolder,
                       String accountNumber) {

        this(accountHolder, accountNumber, 0.0);
    }

    // Update balance
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative"
            );
        }

        this.balance = balance;
    }

    // Display account information
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder
                + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance;
    }
}
