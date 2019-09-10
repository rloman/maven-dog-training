package nl.itacademy.dogtraining.polymorfism;

import nl.itacademy.ocp.designpatterns.factory.Animal;
import nl.itacademy.ocp.designpatterns.factory.Cow;
import nl.itacademy.ocp.designpatterns.factory.Goat;
import nl.itacademy.ocp.designpatterns.factory.Horse;

public class App {

    public static void main(String[] args) {

        // Kan, ja
        Animal a = new Horse();
        a.eat();

        Animal b = new Cow();

        Animal c = new Goat();

        Animal[] diertjes = {a,b,c};

        AnimalFeeder.feedAnimals(diertjes);
    }
}
