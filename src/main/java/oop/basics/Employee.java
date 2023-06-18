package oop.basics;

// Le nom de la classe doit correspondre au nom du fichier.
public class Employee {
    private int idEmployee;
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(int idEmployee, String lastName, String firstName, double salary) {
        this.idEmployee = idEmployee;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary){
        if(newSalary > 0 && newSalary > this.salary){
            this.salary = newSalary;
        }else{
            System.out.println("Erreur ! le nouveau salaire est invalide");
        }
    }

    public void raise(int percentage){
        this.salary += (this.salary * percentage / 100);
    }

    @Override
    public String toString() {
        return this.idEmployee +", "+this.lastName+", "
                +this.firstName + ", "+ (int)this.salary + " Ar.";
    }
}