package org.example.RemoveDuplicateElementFromArray;

import java.util.Arrays;

public class RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        System.out.println("/***************************************************/");
        System.out.println("-----------  Remove Duplicate Element from Array ----------");
        System.out.println("/***************************************************/");


        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        int[] tempArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }

        tempArray[j++] = array[array.length - 1];
        int[] result = new int[j];
        System.arraycopy(tempArray, 0, result, 0, j);
        return result;
    }

}
