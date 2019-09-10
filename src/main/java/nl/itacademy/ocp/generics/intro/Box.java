package nl.itacademy.ocp.generics.intro;

import java.util.HashSet;
import java.util.Set;

public class Box <E> {

    private Set <E> content = new HashSet<>();

    public void add(E element) {
        content.add(element);
    }

    public void prettyPrint() {
        for(E e: content) {
            System.out.println(e);
        }
    }
}
