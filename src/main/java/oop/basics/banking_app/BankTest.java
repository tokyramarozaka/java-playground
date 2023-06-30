package oop.basics.banking_app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankTest {
    public static void main(String[] args) {
        Customer johnDoe = new Customer(
                "John Doe",
                "john.doe@example.com",
                "+261339942343",
                "test@gmail.com",
                LocalDate.of(1999, 01, 20)
        );

        SavingsAccount johnSavingsAccount = new SavingsAccount(1, johnDoe, 5);
        CurrentAccount johnCurrentAccount = new CurrentAccount(2, johnDoe, 2_000_000);

        johnSavingsAccount.credit(1_000_000);
        johnCurrentAccount.credit(5_000_000);
        johnCurrentAccount.debit(5_500_000);

        List<Account> open = new ArrayList<>();
        open.add(johnSavingsAccount);
        open.add(johnCurrentAccount);
        List<Account> closed = new ArrayList<>();

        Bank mcb = new Bank(open, closed);

        mcb.update();

        System.out.println("OPEN after update : " + mcb.getOpen());
        System.out.println("CLOSED after update : " + mcb.getClosed());
        // 1.050.000 for the savingsAccount of John Doe.
        // no changes about the current account

    }
}
