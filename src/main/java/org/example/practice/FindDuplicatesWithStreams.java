package org.example.practice;

import java.util.Arrays;

public class FindDuplicatesWithStreams {
    public static void main(String[] args) {
        System.out.println("Find duplciates with Streams api");
        var start = System.nanoTime();
        int[] arr ={2,4,6,1,3,6,7,8};

        var result = quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));

        var end = System.nanoTime();
        var total = end - start;
        System.out.println("Total Time : "+ total);
    }

    public static int[] quickSort(int[]arr, int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j<high; j++ ){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return  i;

    }
}
