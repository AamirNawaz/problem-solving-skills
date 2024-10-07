package org.example.CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("LinkedList Example");
        //link list good for insertion | updation, Deletion , worst performance for retrieving | access data

        List<String> myNameslinkedList = new LinkedList<>();
        myNameslinkedList.add("Aamir");
        myNameslinkedList.add("Tahir");
        myNameslinkedList.add("Inam");
        myNameslinkedList.add("Basit");
        myNameslinkedList.add("Altaf");
        myNameslinkedList.add("Altaf");

        //LinkedList -> allowed duplicates
        //single item access
        System.out.println(myNameslinkedList.get(0));

        //all linkedlist print
        System.out.println(myNameslinkedList);

    }
}
