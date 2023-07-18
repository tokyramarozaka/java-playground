package oop.basics.banking_app;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // CurrentAccount and SavingsAccount can be generalized as Account.
    private List<Account> open;
    private List<Account> closed;

    public Bank(List<Account> open, List<Account> closed) {
        this.open = open;
        this.closed = closed;
    }

    public List<Account> getOpen() {
        return open;
    }

    public List<Account> getClosed() {
        return closed;
    }

    public void update(){
        List<Account> toRemove = new ArrayList<>();
        for(Account account : this.open) {
            if(account instanceof SavingsAccount){
                // we need to cast account's type to SavingsAccount to access applyInterest()
                ((SavingsAccount) account).applyInterest();
            }else if(account instanceof CurrentAccount){
                if(account.getBalance() < 0){
                    closed.add(account);
                    toRemove.add(account);
                }
            }
        }
        open.removeAll(toRemove);
    }
}
