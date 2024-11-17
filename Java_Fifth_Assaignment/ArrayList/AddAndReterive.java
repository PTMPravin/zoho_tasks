package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddAndReterive {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mosambi");
        fruits.add("Orange");
        System.out.println("3rd Fruit in Fruits List : "+fruits.get(2));
    }
}
