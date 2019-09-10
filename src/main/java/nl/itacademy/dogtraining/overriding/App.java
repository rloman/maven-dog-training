package nl.itacademy.dogtraining.overriding;

import nl.itacademy.ocp.designpatterns.factory.Animal;
import nl.itacademy.ocp.designpatterns.factory.Horse;

public class App {

    public static void main(String[] args) {
        Animal a = new Animal();

        a.eat();

        Horse h = new Horse();

        h.eat();

    }
}
