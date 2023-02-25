package hw28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("slime");
        words.add("lemon");
        words.add("apple");
        words.add("whine");
        words.add("spine");

        Iterator<String> iterator= words.iterator();
        words.removeIf(n -> n.endsWith("e"));
        System.out.println(words);
    }
}
