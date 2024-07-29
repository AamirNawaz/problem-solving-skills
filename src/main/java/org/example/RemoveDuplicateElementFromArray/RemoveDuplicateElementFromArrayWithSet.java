package org.example.RemoveDuplicateElementFromArray;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicateElementFromArrayWithSet {
    public static void main(String[] args) {
        System.out.println("/***************************************************/");
        System.out.println("-----------  Remove Duplicate Element from Array using Set ----------");
        System.out.println("/***************************************************/");

//        solution :1 - with Set
        int[] numbers = {2, 1, 6, 4, 6, 7, 8, 9, 10, 3};
        Set<Integer> myNumbers = new HashSet<>();
        for (int number : numbers) {
            myNumbers.add(number);
        }
        System.out.println(myNumbers);

    }
}
