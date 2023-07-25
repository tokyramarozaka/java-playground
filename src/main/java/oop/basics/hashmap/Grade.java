package oop.basics.hashmap;

import java.util.Objects;

public class Grade {
    private double grade;
    private int credit;

    public Grade(double grade, int credit) {
        this.grade = grade;
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return Double.compare(grade1.grade, grade) == 0 && credit == grade1.credit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, credit);
        // les notes qui ont une valeur et un coefficent égaux, produiront
        // automatiquement un même hashcode.
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                ", credit=" + credit +
                '}';
    }
}
