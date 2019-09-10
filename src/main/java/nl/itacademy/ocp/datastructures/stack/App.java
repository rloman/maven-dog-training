package nl.itacademy.ocp.datastructures.stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(5);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
