package hw28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("Aston Martin");

        System.out.println(cars);

        for (String car: cars){
            System.out.print(car);
        }
        System.out.println("");

        cars.forEach(car -> System.out.print(car));
        System.out.println("");

        Iterator<String> carsI= cars.iterator();
        while (carsI.hasNext()){
            System.out.print(carsI.next());
        }

    }
}
