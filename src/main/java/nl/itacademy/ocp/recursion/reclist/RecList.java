package nl.itacademy.ocp.recursion.reclist;

import java.util.Optional;

public class RecList {

    private Object head;
    private RecList tail;

    public void add(Object value) {
        if(this.head == null) {
            this.head = value;
            this.tail = new RecList();
        }
        else  {
            this.tail.add(value);
        }
    }

    public void print() {
        if(head == null) {
            return;
        }
        else {
            System.out.print(head+", ");
            tail.print();
        }
    }

    public int size() {
        if(head == null) {
            return 0;
        }
        else {
            return 1 + tail.size();
        }
    }

    public Optional<Object> get(Object o) {
        if(head == null) {
            return Optional.empty();
        }
        else {
            if(head.equals(o)) {
                return Optional.of(head);
            }
            else {
                return tail.get(o);
            }
        }
    }
}
