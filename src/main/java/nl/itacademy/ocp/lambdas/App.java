package nl.itacademy.ocp.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));

        numbers.forEach(System.out::println);  // method reference

        // System.out::println is a Consumer want String in, void uit

        // contrast Producer => Supplier

        Supplier<String> stringSupplier = String::new;

        String firstName = stringSupplier.get();

        createString(stringSupplier);

        int a = 3;

        List<Integer> andere = new ArrayList<>();


        numbers.stream().forEach(n -> {

            // a is here effectively final
            // unable to change a (local var or field)
//            a = 0; // vout ook als a nog niet is ge-initialiseerd
//            numbers.add(0, 3); // RuntimeException (ConcurrentModificationException)
            andere.add(n);
        });


        BiConsumer<Integer, String> diner = (n, s) -> {
            System.out.println(n);
            System.out.println(s);
        };

        diner.accept(25, "Gehaktbal");

        Function<Integer, Double> square = n -> Math.pow(n, 2);

        System.out.println(square.apply(16));

        BiFunction<Integer, Integer, String> concatter = (n, m) -> {
            return "" + n + m;
        };

        System.out.println(concatter.apply(3,4));

        BiFunction<Integer, Integer, Double>  powering = Math::pow;

        UnaryOperator<Integer> adder = new UnaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        // in: two arguments of type Integer (n,m) and returns
        // the sum of the two arguments of type Integer which also MUST be Integer (which is)...
        BinaryOperator<Integer> summer = (n,m) ->  n+m;
    }

    public static void createString(Supplier<String> supplier) {

    }
}
