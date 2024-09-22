package org.example.PalindromeChecker;

public class NumberPalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Number palindrome checker!");
        isNumberPalindrome(515);


    }

    //first step reverse number
    //compare reverse number with original number
    public static void isNumberPalindrome(int number){
        String numInString = Integer.toString(number);
        StringBuilder sb = new StringBuilder(numInString);
        String reverseNumberInString = sb.reverse().toString();
        int reverseNumber = Integer.parseInt(reverseNumberInString);

        if(number == reverseNumber){
            System.out.println(number + " is a palindrome");
        }else{
            System.out.println(number + " is not a palindrome");
        }
    }
}
