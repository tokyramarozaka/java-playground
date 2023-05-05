package algo.basics;

import java.util.Arrays;

public class Duplicate {
    public static String[] removeDup(String[] input){
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            String removed = "";
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) != word.charAt(j + 1)) {
                    removed += word.charAt(j);
                }
            }
            result[i] = removed + word.charAt(word.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] actual =  Duplicate.removeDup(new String[]{
                "bonjour", "boonsoir", "tteemmpps", "abcdd"
        });
        System.out.println(Arrays.toString(actual));
    }
}