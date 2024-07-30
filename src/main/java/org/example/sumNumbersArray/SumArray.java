package org.example.sumNumbersArray;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("Sum Array Element and return its final Sum result!");

        int[] numbers = {2,4,5,6,7,8,10};
        int result = sumArray(numbers);
        System.out.println(result);
    }

    public static int sumArray(int arr[]){
        int sum =0;
        for(int i=0; i <arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
