package org.example.RemoveDuplicateElementFromArray;

import java.util.*;

public class RemoveDuplicateOTimeComplexity {
    public static void main(String[] args) {
        System.out.println("Remove Duplicate Element from Array with Fast way less Time Complexity!");

        int[] arr = {2,3,6,7,8,2,4,6,3,1};
        var duplicatesElements = removeDuplicates(arr);
        System.out.println(duplicatesElements);
    }

    public static ArrayList<Object> removeDuplicates(int[] arr){
        ArrayList<Object> duplicates = new ArrayList<>(arr.length);
        Set<Integer> seen = new HashSet<>();
        for(int num: arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
