package Deposit_withdraw_03;

public class BankAccount {
    private double amount;
    public void deposit(double amt)
    {
        if(amt>0) {


            amount += amt;
        }
        else {
            System.out.println("entee valid amount");
        }
    }
    public double withdraw()
    {
        return amount;
    }
}
