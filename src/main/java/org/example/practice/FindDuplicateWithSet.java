package org.example.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWithSet {
    public static void main(String[] args) {
        var start = System.nanoTime();
        int[] arr ={2,4,6,1,3,6,7,8};
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        var end = System.nanoTime();
        var total = end - start;
        System.out.println("Total Time : "+ total);
        System.out.println(duplicates);



    }
}
