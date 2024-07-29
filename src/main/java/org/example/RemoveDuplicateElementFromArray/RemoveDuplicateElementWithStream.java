package org.example.RemoveDuplicateElementFromArray;

import java.util.Arrays;

public class RemoveDuplicateElementWithStream {
    public static void main(String[] args) {
        System.out.println("/***************************************************/");
        System.out.println("-----------  Remove Duplicate Element from Array Using Streams----------");
        System.out.println("/***************************************************/");

        // With streams solution
//        Integer[] numbersArray = {0, 2, 1, 6, 4, 6, 7, 8, 9, 10, 3}; // .boxed() will not needed
        int[] numbersArray = {0, 2, 1, 6, 4, 6, 7, 8, 9, 10, 3}; // .boxed will required to convert primitive int to Integer class
        var result = Arrays.stream(numbersArray)
                .boxed()
                .sorted((a,b)-> b-a) // for Desc order  b-a , a-b for asc
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(result));
    }

}

