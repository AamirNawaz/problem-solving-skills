package org.example.StreamsApi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Streams api map method!");

        List<String> names = Arrays.asList("apple","banana","orange","avacado","graps","apple","orange");
       var mapResult =  names.stream()
                .map(e-> e.endsWith("o"))
                .toList();
        System.out.println("Mapped result: "+ mapResult); //output: [false, false, false, true, false, false, false]


    //Example int values
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)  // Square each number
                        .toList();
        System.out.println("Squared Numbers: " + squaredNumbers); //output : [1, 4, 9, 16, 25]
    }
}
