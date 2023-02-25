package hw28;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> ints=new ArrayList<>();
        for (int i = 1; i < 500; i++) {
            ints.add(i);
        }
        ints.removeIf(n -> n % 5 ==0);
        System.out.println(ints);
    }
}
