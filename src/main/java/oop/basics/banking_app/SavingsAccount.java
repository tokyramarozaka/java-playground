package oop.basics.banking_app;

/**
 * A savings account is a subclass of Account where you can still credit, debit or transfer money
 * But in addition to all of those things, it has an interest rate which is a percentage of your
 * actual balance that you can get at the end of the month
 */
public class SavingsAccount extends Account{
    private double interest;

    public SavingsAccount(int accountId, Customer owner, double interest) {
        super(accountId, owner); // superclass, subclass
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void applyInterest(){
        this.credit(this.getBalance() * this.interest / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", interest="+this.interest;
    }
}
