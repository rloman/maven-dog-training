package nl.itacademy.ocp.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(1);
        queue.add(15);


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
    }
}
