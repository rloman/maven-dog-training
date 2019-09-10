package nl.itacademy.ocp.recursion;

import nl.itacademy.ocp.recursion.reclist.RecList;

import java.util.Optional;

public class AppReclist {

    public static void main(String[] args) {
        RecList list = new RecList();


        list.add("A");
        list.add("B");
        list.add("C");

        list.print();

        System.out.println(list.size());

        {
            Optional<Object> optionalObject = list.get("B");
            if (optionalObject.isPresent()) {
                Object o = optionalObject.get();
                System.out.println(o);
            }
        }
        {


            Optional<Object> optionalObject = list.get("D");
            if (optionalObject.isPresent()) {
                Object o = optionalObject.get();
                System.out.println(o);
            }
        }

        System.out.println(list.get("E").orElse("niet gevonden"));


    }
}
