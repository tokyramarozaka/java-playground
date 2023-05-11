package algo.basics;

import java.util.List;

/**
 * The exam of H1 and H3
 */
public class Sum {
    public static int ofOdds(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 1){
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static int ofOdds_withStream(List<Integer> list){
        return list.stream()
                .filter(element -> element % 2 == 1)
                .reduce(0,(acc, val) -> acc + val);
    }
}
