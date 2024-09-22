package org.example.PalindromeChecker;

public class StringPalindromeChecker {
    public static void main(String[] args) {
        System.out.println("String palindrome checker!");
        isPalindrome("ala");
    }

    public static void isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if(reverse.equals(str)){
            System.out.println(str + " is a palindrome!");
        }else {
            System.out.println(str + " is not a palindrome!");
        }
    }
}
