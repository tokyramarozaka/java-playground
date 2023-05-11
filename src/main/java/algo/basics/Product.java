package algo.basics;

import java.util.Arrays;
import java.util.List;

/**
 * The exam of H2 and H4.
 */
public class Product {
    public static int ofList(List<Integer> list){
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }

    public static int ofList_withReduce(List<Integer> list){
        return list.stream().reduce(1, (acc, val) -> acc * val);
    }

    public static void main(String[] args) {
        System.out.println(Product.ofList(Arrays.asList(1, 4, 7, 2)));
    }
}
