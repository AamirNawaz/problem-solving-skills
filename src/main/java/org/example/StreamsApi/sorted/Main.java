package org.example.StreamsApi.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorting with Streams api!");

        //************************************************
        //With Primitive DataType
        //************************************************
        int[] numbers = {8,2,9,12,3,4,5,7,6};
        int[] sort = Arrays.stream(numbers)
                .boxed()
                .sorted((a,b) ->(b-a)) // a-b for ASC | b-a for DSC
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sort)); // output : [12, 9, 8, 7, 6, 5, 4, 3, 2]

        //************************************************
        //With List - ArrayList
        //************************************************
        List<Integer> nums = Arrays.asList(8,2,9,12,3,4,5,7,6);
        var sort_2 = nums.stream()
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(sort_2); // output : [12, 9, 8, 7, 6, 5, 4, 3, 2]

    }
}
