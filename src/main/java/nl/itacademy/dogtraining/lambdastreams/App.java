package nl.itacademy.dogtraining.lambdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55));

        long sum = numbers.stream().filter(n -> n %2 != 0).map(n -> n*n).distinct().limit(3).mapToInt(n -> n).sum();

        System.out.println(sum);
    }
}
