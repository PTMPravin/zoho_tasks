package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBehaviorWithLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie"); 
        queue.add("Diana");

        System.out.println(queue);

        queue.poll();
        queue.poll();

        System.out.println(queue);
        
    }
}
