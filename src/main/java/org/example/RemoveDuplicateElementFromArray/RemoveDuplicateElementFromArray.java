package org.example.RemoveDuplicateElementFromArray;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        System.out.println("/***************************************************/");
        System.out.println("-----------  Remove Duplicate Element from Array ----------");
        System.out.println("/***************************************************/");

        //solution :1 - with Set
//        int[] numbers ={2,1,6,4,6,7,8,9,10,3};
//        Set<Integer> myNumbers = new HashSet<>();
//        for (int number : numbers) {
//            myNumbers.add(number);
//        }
//        System.out.println(myNumbers);


        //solution :1 - with Set
        int[] naturalNumbers ={0,2,1,6,4,6,7,8,9,10,3};
        int result = 0;
        int[] finalArray = new int[naturalNumbers.length];
        for(int i=0; i<naturalNumbers.length; i++){
            if(naturalNumbers[i]>result){
                finalArray[i]= naturalNumbers[i];
            }
        }
        System.out.println(Arrays.toString(finalArray));

// third solution
        int[] numbersArray = {0,2,1,6,4,6,7,8,9,10,3};
        Arrays.stream(numbersArray).sorted().distinct().toArray();
        System.out.println(Arrays.toString(numbersArray));
    }
}
