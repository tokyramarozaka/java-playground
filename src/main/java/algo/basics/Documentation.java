package algo.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A simple class documenting various functions and methods that can be used in Katas for Java
 */
public class Documentation {
    public static void main(String[] args) {
        // JOIN
        String[] array = {"Bon","jour","no","!"};
        String result = String.join("", array);

        // Autre manière à part STREAM
        String result2 = Arrays.stream(array)
                .collect(Collectors.joining());

        // SPLIT
        String string = "Root me is awesome!";
        string.split(" ");

        // REPEAT
        "bye".repeat(2); // byebye
        "-".repeat(100);

        // INDEXOF
        String someString = "Hello";
        someString.indexOf("e"); // 1

        // FILTER
        List<Integer> listeEntiers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> arrayOdd = listeEntiers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        // SUBSTRING
        String word = "Java is bae";
        word.substring(0,3); // 0 = index de début, 3 = index de fin EXCLU

        // MAP
        List<Integer> squareValues = listeEntiers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        // SORT
        Collections.sort(listeEntiers); // le tableau original est affecté !
        listeEntiers.stream().sorted((a, b) -> b - a); // le tableau original n'est pas affecté

        // SORT By length
        List<String> words = Arrays.asList("Bonjour", "Anticonstitutionnellement", "Kayak");
        List<String> sorted = words.stream()
                .sorted((a,b) -> b.length() - a.length())
                .collect(Collectors.toList());
    }
}
