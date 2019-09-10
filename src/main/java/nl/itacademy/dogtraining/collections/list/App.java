package nl.itacademy.dogtraining.collections.list;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // recap and intro

        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}; // 12

//        numbers[12] = 144; // vout

        // array is dus fixed

        // oplossing

        // ArrayList

        {
            List<String> names = new ArrayList<>();

            String firstName = "Lieke";
            names.add(firstName);
            names.add("Francien");
            names.add("Raymond");
            names.add("Peter");

            System.out.println(names);

            System.out.println(names.get(2));

            for(String name: names) {
                System.out.println(name);
            }
        }

        {
            List<String> names = new LinkedList<>();
            String firstName = "Lieke";
            names.add(firstName);
            names.add("Francien");
            names.add("Raymond");
            names.add("Peter");

            System.out.println(names);

            System.out.println(names.get(2));

            for(String name: names) {
                System.out.println(name);
            }

            Collections.sort(names);
            System.out.println(names);

            Collections.sort(names, Comparator.reverseOrder());
            System.out.println(names);

            System.exit(0);
        }

        {
            Set<String> names = new HashSet<>();
            String firstName = "Lieke";
            names.add(firstName);
            names.add("Francien");
            names.add("Raymond");
            names.add("Peter");

            System.out.println(names);

//            System.out.println(names.get(2)); // weg

            for(String name: names) {
                System.out.println(name);
            }
        }
    }
}
