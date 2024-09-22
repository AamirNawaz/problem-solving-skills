package org.example.practice;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        var start = System.nanoTime();
        int[] arr ={2,4,6,1,3,6,7,8};
        ArrayList<Object> duplicates = new ArrayList<>();



        for(int i =0; i <arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]==arr[j]){
                    duplicates.add(arr[j]);
                    break;
                }
            }
        }
        var end = System.nanoTime();
        var total = end - start;
        System.out.println("Total Time : "+ total);

        System.out.println(duplicates);
    }
}
