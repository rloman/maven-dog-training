package nl.itacademy.ocp.generics.unboundedAndUpperBoundedAndLowerBounded;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Puppy> puppies = new ArrayList<>();

        List<Animal> animals = new ArrayList<>();

//        animals.add(new Cat()); // legal

        List<Dog> dogs = new ArrayList<>();
        // AnimalDoctor.cureAnimalsUnbounded(dogs); // fails and that is because List<Animal> != List<Dog> simple as that!
        AnimalDoctor.cureAnimalsUnbounded(animals);



        // rocks. And because we said to
        // the receiving method that it is ok to have a List with subtypes of Animal (here Dog)
        AnimalDoctor.cureAnimalsUpperbounded(dogs);
        AnimalDoctor.cureAnimalsUpperbounded(animals);
        AnimalDoctor.cureAnimalsUpperbounded(puppies);
//        AnimalDoctor.cureAnimalsUpperbounded(new ArrayList<String>()); // fails





        AnimalDoctor.cureAnmalsLowerLowerBounded(dogs); // rocks

//        AnimalDoctor.cureAnimalsUnbounded(puppies); // fails, since we are sending a more specific List than
        // a List<Dog>

        AnimalDoctor.cureAnimalsUpperbounded(animals); // rocks, since it is a more specific type.
        // so we can send a list with animals since that List contains Animals so
        // it is no problem that we might add a Dog (or lower) to the reciever ... =>

    }
}
