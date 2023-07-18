package oop.basics.banking_app;

public class Account {
    private int accountId;
    private Customer owner;
    protected double balance;
    // protected because CurrentAccount needs access to it directly to implement its debit method.

    public Account(int accountId, Customer owner) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = 0.0;
    }

    public int getAccountId() {
        return accountId;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount){
        this.balance += amount;
    }

    public void debit(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        }else{
            System.out.println("You do not have enough funds to withdraw that amount");
        }
    }

    public void transferToAccount(Account target, double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            target.credit(amount);
        }else{
            System.out.println("You do not have enough funds to make this transfert");
        }
    }

    // La classe "Object" est la mère de toutes les classes
    // dans cette classe y a les méthodes: toString, equals
    @Override
    public String toString() {
        return "accountId=" + accountId +
                ", owner=" + owner +
                ", balance=" + balance;
    }
}
