package assig_1_3;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposit(0);
        System.out.println("Final amount is : "+b1.withdraw());
    }
}
