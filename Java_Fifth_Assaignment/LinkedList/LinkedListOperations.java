package LinkedList;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=1;i<=12;i++){
            list.add(i);
        }

        System.out.println(list);
        
        list.remove(2);
        list.remove(list.size()-1);

        System.out.println(list);
    }
}
