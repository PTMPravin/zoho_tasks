package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchForAnElement {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        for(char ch='A';ch<='L';ch++) {
            characters.add(ch);
        }

        System.out.println(characters);

        System.out.println(indexOf(characters, 'L'));
    }

    public static int indexOf(List<Character> characters, char ch) {
        int len = characters.size();
        for(int i=0;i<len;i++) {
            if (characters.get(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
