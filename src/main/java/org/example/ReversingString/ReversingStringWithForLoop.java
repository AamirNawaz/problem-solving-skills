package org.example.ReversingString;

public class ReversingStringWithForLoop {
    public static void main(String[] args) {
        System.out.println("Reverse string");

        String s = "hello world";
        for (int i= s.length(); i>0; --i){
            System.out.print(s.charAt(i-1));
        }
    }
}
