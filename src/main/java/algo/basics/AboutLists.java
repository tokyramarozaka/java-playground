package algo.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AboutLists {
    public static List<String> convertAndFilter(String[] array){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (word.length() >= 4) {
                result.add(word);
            }
        }
        return result;
    }

    public static List<String> convertAndFilter2(String[] array){
        return Arrays.stream(array)
                .filter(word -> word.length() >= 4)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] inputTest = new String[]{
                "hello", "hey", "hi!", "bonjour", "konichiwa", "kaiza"
        };

        System.out.println(AboutLists.convertAndFilter2(inputTest));
    }
}