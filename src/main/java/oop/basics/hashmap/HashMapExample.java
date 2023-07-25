package oop.basics.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Grade> hashMap = new HashMap<>();
        hashMap.put("1st test", new Grade(17.0, 2));
        hashMap.put("2nd test", new Grade(19.0, 3));
        hashMap.put("3rd test", new Grade(9.0, 5));
        hashMap.put("3rd test", new Grade(20.0, 5));

        hashMap.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}
