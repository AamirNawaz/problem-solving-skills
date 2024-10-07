package org.example.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        System.out.println("Set Example");

        Set<String> names = new HashSet<>();
        names.add("Aamir");
        names.add("Aamir"); //duplicate entry will not store in set
        names.add("Tahir");
        names.add("Inam");
        names.add("Basit");
        names.add("Altaf");
        System.out.println(names); //output: [Basit, Inam, Aamir, Altaf, Tahir]

        //print using foreach loop
        names.forEach(s -> {
            System.out.println(s);
        });
    }
}
