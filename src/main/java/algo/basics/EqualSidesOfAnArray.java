package algo.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] array){
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            int leftSum = list.subList(0, i).stream()
                    .reduce(0, (a,b) -> a+b);
            int rightSum = list.subList(i+1, list.size()).stream()
                    .reduce(0, (a,b) -> a +b);

            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1})); // 3
    }
}
