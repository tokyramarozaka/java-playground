package algo.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to display the fundemental operations on a list
 */
public class BasicLists {
    public static void main(String[] args) {
        // Creer la liste (n'accepte pas les types primitifs)
        List<Integer> liste = new ArrayList<>();
        Integer x = 10;

        // CTRL+Q : afficher la documentation
        liste.add(12);
        liste.add(10);
        liste.size();
        System.out.println(liste.get(0)); // 12

        // types primitifs : int, char, boolean, float, double, byte, long
        // "wrappers" : Integer, Character, Boolean, Float, Double, Byte, Long
    }
}
