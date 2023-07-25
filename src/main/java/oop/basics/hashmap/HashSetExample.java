package oop.basics.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet : un ensemble de valeurs qui n'accepte pas les doublons
        // en interne : HashSet utilise les hashCodes.
        Set<Grade> gradeSet = new HashSet<>();
        gradeSet.add(new Grade(19.0, 3));
        gradeSet.add(new Grade(19.0, 3));
        gradeSet.add(new Grade(19.0, 3));
        gradeSet.add(new Grade(19.0, 3));
        gradeSet.add(new Grade(18.0, 2));

        for (Grade grade : gradeSet) {
            System.out.println(grade + ", hashCode : " + grade.hashCode());
        }
    }
}
