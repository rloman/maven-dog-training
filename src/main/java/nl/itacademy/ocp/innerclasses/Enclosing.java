package nl.itacademy.ocp.innerclasses;

public class Enclosing {

    private int age;

    static class Nested {
        private int price = 6;

        static void demo() {

        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        Nested.demo();

        Enclosing enclosing = new Enclosing();
        enclosing.age++;
        Enclosing.Nested.demo();

        System.out.println(nested.price);
    }
}
