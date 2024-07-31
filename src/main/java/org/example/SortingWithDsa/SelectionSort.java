package org.example.SortingWithDsa;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection sort !");

        int[] arr = {4,2,3,5,6,7,8,1,9};
        var finalArray = selectionSort(arr);
        System.out.println(Arrays.toString(finalArray));

    }

    public static int[] selectionSort(int[] arr){
        // Loop through the entire array
        for (int i = 0; i < arr.length; i++) {
            // Step 1 - Assume the current index is the minimum
            int minIndex = i;

            // Step 2 - Find the actual minimum element in the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                // Step 3 - Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // Return the sorted array
        return arr;
    }
}
