package org.example.CollectionFramework;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Apple", 30); // Duplicate key, will overwrite previous value

        System.out.println("HashMap: " + hashMap); //output: HashMap: {Apple=30, Banana=20}
    }
}