package nl.itacademy.ocp.designpatterns.delegate;

import java.util.ArrayList;
import java.util.List;

public class Eggbox {

    private List<Egg> eggs = new ArrayList<Egg>();

    public boolean isEmpty() {
        return eggs.isEmpty();
    }

    public boolean contains(Object o) {
        return eggs.contains(o);
    }

    public boolean add(Egg egg) {
        return eggs.add(egg);
    }

    public void clear() {
        eggs.clear();
    }

    public Egg get(int index) {
        return eggs.get(index);
    }
}
