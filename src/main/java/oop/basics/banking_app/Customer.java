package oop.basics.banking_app;

import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;

    public Customer(String firstName, String lastName, String phoneNumber, String email,
                    LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email;
    }
}
