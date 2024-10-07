package org.example.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);

        System.out.println("Polling the first element: " + queue.poll()); // Removes and returns the head
        System.out.println("Queue after poll: " + queue);
    }
}
