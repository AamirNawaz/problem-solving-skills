package org.example.StreamsApi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Filter method in Streams api!");

        List<String> fruits = Arrays.asList("apple","banana","orange","avacado","graps");
        
        //filter all fruits starting with character  'a'
        var filteredFruits = fruits.stream()
                .filter(s-> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredFruits); // output: [apple,avacado]

        // return first element only 
        var firstElement = fruits.stream()
                .filter(s->s.startsWith("a"))
                .findFirst()
                .orElse("Not found!");
        System.out.println("firstElement = " + firstElement); //output: firstElement = apple
    }
}
