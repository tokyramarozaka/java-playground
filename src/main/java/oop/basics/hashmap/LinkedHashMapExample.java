package oop.basics.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Grade> hashMap = new LinkedHashMap<>();
        hashMap.put("1st test", new Grade(17.0, 2));
        hashMap.put("2nd test", new Grade(19.0, 3));
        hashMap.put("3rd test", new Grade(9.0, 5));

        hashMap.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
