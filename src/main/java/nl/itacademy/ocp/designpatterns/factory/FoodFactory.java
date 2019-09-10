package nl.itacademy.ocp.designpatterns.factory;

public final class FoodFactory {

    private FoodFactory() {

    }

    public static Food getFood(Animal animal) {

        if(animal instanceof Horse) {
            return new Oats();
        }
        if(animal instanceof Cow) {
            return new Hay();
        }
        if(animal instanceof Goat) {
            return new Pellets();
        }

        throw new IllegalArgumentException();
    }


}
