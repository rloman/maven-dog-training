package nl.itacademy.ocp.designpatterns;

import nl.itacademy.ocp.designpatterns.factory.Animal;
import nl.itacademy.ocp.designpatterns.factory.Food;
import nl.itacademy.ocp.designpatterns.factory.FoodFactory;

public class App {

    public static void main(String[] args) {
        Animal jollyJumper = new Animal();

        Food eten = FoodFactory.getFood(jollyJumper);

        System.out.println(eten.getClass());

//        Hay voetje = new Hay();
    }
}
