package org.example.StreamsApi.distinct;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stream api Distinct Example");

        List<String> names = Arrays.asList("apple","banana","orange","avacado","graps","apple","orange");

        //remove duplicates with distinct
       var result =  names.stream()
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
