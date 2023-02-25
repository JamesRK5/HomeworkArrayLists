package hw28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("Monster");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")){
                drinks.set(i, "Water");
            }
        }

        System.out.println(drinks);

    }
}
