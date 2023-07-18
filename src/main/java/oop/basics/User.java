package oop.basics;

/**
 * 1. une classe marquée abstract, ne peut pas être instanciée.
 * 2. seule une classe abstraite peut contenir des méthodes abstraites
 * elle peut aussi contenir des méthodes concrètes.
 * Une méthode abstraite, c'est une méthode qui n'a pas de corps.
 * 3. Pourquoi ? c'est pour créer une classe mère commune pour des classes
 * qui ont des points communs : on écrit une fois, et on deverse dans
 * les classes filles par heritage.
 */
public abstract class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(int id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String email, String password){
        return password.equals("123") && email.equals("user@gmail.com");
    }

    public abstract void showWelcomeMessage();

}