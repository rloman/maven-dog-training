package nl.itacademy.dogtraining.polymorfism;

import nl.itacademy.ocp.designpatterns.factory.Animal;

public final class AnimalFeeder {

    public static void feedAnimals(Animal[] animals) {

        for(Animal a : animals) {
            a.eat();
        }

    }
}
