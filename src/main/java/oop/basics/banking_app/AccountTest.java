package oop.basics.banking_app;

import java.time.LocalDate;

public class AccountTest {
    public static void main(String[] args) {
        Customer john = new Customer(
                "John",
                "Doe",
                "0341382832",
                "John@gmail.com",
                LocalDate.of(1990, 10, 8)
        );

        Customer stevie = new Customer(
          "Stevie",
          "Wonder",
          "0335582322",
          "stevie@gmail.com",
          LocalDate.of(1999, 12, 4)
        );

        Account johnAccount = new Account(
            1,
            john
        );

        Account stevieAccount = new Account(
          2,
          stevie
        );

        johnAccount.debit(1000); // should output an error
        johnAccount.credit(1_000_000);
        johnAccount.debit(200_000);
        System.out.println(johnAccount.getBalance());// should show 800_000

        johnAccount.transferToAccount(stevieAccount, 500_000);
        System.out.println(johnAccount.getBalance()); // has now 300_000
        System.out.println(stevieAccount.getBalance());// has now 500_000
    }
}
