package org.example.SortingWithDsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("*********** Quick Sort ****************");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        // Step 1
        int[] arr = {9,7,8,6,1,2,4,3,5};
        int lengthOfArray = arr.length;
        quickSort(arr,0,lengthOfArray-1);
        System.out.println(Arrays.toString(arr));

    }

    // Step 2
    public static void quickSort(int arr[],int low,int high){
           if(low <high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1,high);
           }
        }

    // Step 3
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;
        return i;
    }
   

}
