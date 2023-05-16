package algo.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public static int[] arrayDiff(int a[],int[] b) {
        List<Integer> listB = Arrays.stream(b)
                .boxed() // boxed : int -> Integer, car List<int> est interdit
                .collect(Collectors.toList());

        return Arrays.stream(a)
                .filter(value -> !listB.contains(value))
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr={1,22,2,5,2,3};
        int[] arr2={2,3};
        int[] arr3=arrayDiff(arr,arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
