package nl.itacademy.ocp.datastructures.stack;

// this class shows only methods call
// instruction is that the call to the jvm to
// main is a stack frame
// the call from main to foo is a stack frame
// the call from foo to bar is a stack frame
public class DemoApp {

    public static void main(String[] args) {

        int result = foo();

        System.out.println(result);

    }

    public static int foo() {
        int b = bar();

        return b;
    }

    public static int bar() {
        int a = 8;

        return a;
    }
}
