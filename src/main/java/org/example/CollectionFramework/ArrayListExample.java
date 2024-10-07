package org.example.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("Java Collection framework - ArrayList");

        //Array list good for fast access,  retrieval of data , worst performance for insertion | Deletion
        List<String> names = new ArrayList<>();
        names.add("Aamir");
        names.add("Tahir");
        names.add("Basit");
        names.add("Inam");
        names.add("Altaf");
        names.add("Inam");

        //ArrayList -> allowed duplicates
        //Index based access single element
        System.out.println(names.get(0)); //output : Aamir

        //complete arrayList
        System.out.println("ArrayList:" + names);

    }
}
