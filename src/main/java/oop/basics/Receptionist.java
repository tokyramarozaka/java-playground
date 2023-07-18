package oop.basics;

public class Receptionist extends User{
    public Receptionist(int id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    public void validateReservation(int id){
        System.out.println("Reservation validée.");
    }

    @Override
    public void showWelcomeMessage() {
        System.out.println("Bienvenue ! Vous avez X reservations à valider");
    }
}
