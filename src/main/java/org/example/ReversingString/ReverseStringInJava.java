package org.example.ReversingString;

import java.util.Arrays;

public class ReverseStringInJava {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("***** Reversing String in Java With StringBuilder & StringBuffer classes!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        //With StringBuilder - Not thread safe method
        String message = "Hello World";
       StringBuilder sb = new StringBuilder(message);
        var result = sb.reverse();
        System.out.println(result);

        //With StringBuffer - Thread safe method
        String newMessage = "Welcome";
        StringBuilder stringBuffer = new StringBuilder(newMessage);
        var finalResult = stringBuffer.reverse();
        System.out.println(finalResult);

    }

}
