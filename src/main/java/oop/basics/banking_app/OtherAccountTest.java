package oop.basics.banking_app;

import java.time.LocalDate;

public class OtherAccountTest {
    public static void main(String[] args) {
        Customer johnDoe = new Customer(
                "John Doe",
                "john.doe@example.com",
                "+261339942343",
                "test@gmail.com",
                LocalDate.of(1999, 01, 20)
        );

        SavingsAccount savingsAccount = new SavingsAccount(1, johnDoe, 5);
        CurrentAccount currentAccount = new CurrentAccount(2, johnDoe, 200);

        // TEST : applyInterest works for savingsAccount
        savingsAccount.credit(1_000_000);
        System.out.println("Savings Account Balance (before applying interest) : " + savingsAccount
                .getBalance());
        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance (after applying interest) : " + savingsAccount
                .getBalance());

        // TEST : current account can have negative balance
        System.out.println("Current Account Initial Balance : " + currentAccount.getBalance());
        currentAccount.debit(100);
        System.out.println("Current Account Balance after debit 100 : " + currentAccount
                .getBalance());

        // TEST : current accounts should not allow negative balance beyond the given threshold.
        currentAccount.debit(1000.0);
        System.out.println("Current Account Balance after failed debit : " + currentAccount
                .getBalance());
    }
}
