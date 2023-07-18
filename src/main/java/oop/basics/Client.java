package oop.basics;

public class Client extends User{
    private char gender;
    public Client(int id, String firstName, String lastName, String email, String password, char gender) {
        super(id, firstName, lastName, email, password);
        this.gender = gender;
    }

    public void reserve(int id){
        System.out.println("Votre reservation a été enregistrée");
    }
    @Override
    public void showWelcomeMessage() {
        System.out.println("Bienvenue chez Stellar Hotel, L'hotel où vos rêves se réalisent");
    }


}
