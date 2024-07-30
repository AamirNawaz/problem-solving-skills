package org.example.SortingWithDsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("*********** Bubble Sort ****************");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

// In Bubble sort - sorting start from Highest to lowest element in the array.
        int[] numbers = {6,9,7,3,8,5,2,1,4,10};
        for (int i =0; i< numbers.length -1; i++){
            for(int j =0; j <numbers.length -1-i; j++){
                if(numbers[j] >= numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
