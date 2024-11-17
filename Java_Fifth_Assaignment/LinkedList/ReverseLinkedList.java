package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');

        Collections.reverse(list);
        System.out.println(list);
    }
}
