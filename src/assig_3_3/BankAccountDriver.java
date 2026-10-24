
package assig_3_3;

public class BankAccountDriver {

    public static void main(String[] args) {

        // Using constructor with all fields
        BankAccount account1 =
                new BankAccount("Asif", "ACC101", 5000.0);

        // Using constructor with two fields
        BankAccount account2 =
                new BankAccount("Rahul", "ACC102");

        // Update balance
        account2.setBalance(2000.0);

        // Display account details
        System.out.println(account1);
        System.out.println();

        System.out.println(account2);
    }
}
