package algo.basics;

import java.util.Arrays;

public class Wolf {
    static String protectVillagers(String[] input){
        int wolfIndex = Arrays.asList(input).indexOf("loup");

        if(wolfIndex == input.length - 1){
            return "Va-t-en!";
        }
        return "Attention villageois numéro "+(input.length - wolfIndex - 1)+"!";
    }
}
