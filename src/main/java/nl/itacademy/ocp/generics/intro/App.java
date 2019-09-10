package nl.itacademy.ocp.generics.intro;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Aap");

        // voldoende voor oca.

        //handig

        Box<Integer> numberBox = new Box<>();
        numberBox.add(3);
        numberBox.add(5);
        numberBox.add(8);

        // print it
        numberBox.prettyPrint();

    }
}
