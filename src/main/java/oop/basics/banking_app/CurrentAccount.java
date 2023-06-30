package oop.basics.banking_app;

/**
 * A current account is a subclass of Account that allows you to have a negative balance up to a
 * certain limit. Therefore, the debit and transfer methods should behave a bit differently to those
 * in the superclass Account, we say that we "Override" it.
 */
public class CurrentAccount extends Account {
    /**
     * by convention the threshold is the negative balance allowed. We have explicitly chosen to
     * represent it by a positive double to not get confused.
     */
    private double threshold;

    public CurrentAccount(int accountId, Customer owner, double threshold) {
        super(accountId, owner);
        this.threshold = threshold;
    }

    /**
     * We override the debit method from the superclass because it differs from the one in the
     * Account class. We need to redefine it to take the threshold into account.
     * @param amount : the amount of money we want to withdraw from the account.
     */
    @Override
    public void debit(double amount) {
        if(hasEnoughFundsOnDebit(amount)){
            this.balance -= amount; // if we used super.debit, negative balance wouldn't be allowed.
        }else{
            System.out.println("You do not have enough funds left to do this operation");
        }
    }

    /**
     * TransferToAccount needs to be overridden too, as it did not allow negative balance in the
     * superclass.
     * @param target : the target to which we want to transfer the amount
     * @param amount : how much money we want to transfer
     */
    @Override
    public void transferToAccount(Account target, double amount) {
        if (this.hasEnoughFundsOnDebit(amount)){
            this.balance -= amount;
            target.credit(amount);
        }else{
            System.out.println("You do not have enough funds left to do this operation");
        }
    }

    /**
     * Just a simple helper method to avoid writing the condition everytime. It is much more handy
     * to have it in a function and call it, and it is much more readable too as it is closer to
     * the words we use in real life.
     * @param amount : the amount of money we are about to debit from the account.
     * @return true if there is enough funds do sustain the debit operation, and false otherwise.
     */
    private boolean hasEnoughFundsOnDebit(double amount){
        return this.getBalance() - amount >= -threshold;
    }

    @Override
    public String toString() {
        return super.toString() + ", threshold="+this.threshold;
    }
}
