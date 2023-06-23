package oop.basics;

public class Account {
    private int accountId;
    private Customer owner;
    private double balance;

    public Account(int accoundId, Customer owner) {
        this.accountId = accoundId;
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

    @Override
    public String toString() {
        return "accountId=" + accountId +
                ", owner=" + owner +
                ", balance=" + balance;
    }
}
