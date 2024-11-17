package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateAndModifyElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("Original List: " + list);

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next() == "three") {
                iterator.set("THREE");
            }
        }

        System.out.println("Original List: " + list);
    }
}
