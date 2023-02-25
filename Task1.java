package hw28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("James");
        names.add("Ilona");
        names.add("Grant");
        names.add("Mike");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("James"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
