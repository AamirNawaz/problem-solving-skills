package org.example.StreamsApi.reduce;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stream api - Reduce method!");

        List<Integer> numbers = Arrays.asList(2,3,12,4,1);

        //calculate the sum for all the elements
        int sum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum : " + sum); //output : 22

        //with Lambda interface method
        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("With Lambda interface Sum : " + sum2); //output : 22
    }
}
