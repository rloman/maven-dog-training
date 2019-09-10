package nl.itacademy.ocp.generics.unboundedAndUpperBoundedAndLowerBounded;

import java.util.List;

public final class AnimalDoctor {


    // verwacht een List<Animal>
    public static void cureAnimalsUnbounded(List<Animal> animals) {

        animals.add(new Cat());

//        animals.add(new Object()); // vout

    }


    public static void cureAnimalsUpperbounded(List<? extends Animal> animals) {

        // receives a List<Dog>, List<Pig> and whatever ...

        // unable to add  (do you know why>?)
        Cat c = new Cat();
//        animals.add(c); // fails

        // answer: since we could then send a List with Dogs
        // and add a Cat to it (which is normal expected since we are receiving an Animals list are we ...)

    }

    public static void cureAnmalsLowerLowerBounded(List<? super Dog> dogsOrHigherHierarchy) {

        // super => that is kind of super ... :-) so we can even add some here (ezelsbrug)

        // Can we add a Dog?
        Dog d = new Dog();
        dogsOrHigherHierarchy.add(d); // yes

        // Can we add a Puppy?
        Puppy p = new Puppy();
        dogsOrHigherHierarchy.add(p); // yes of course since we arre adding a Dog (a puppy is a Dog)
        // so no problem expedted


        // Can we add an Object
        Object o = new Object();

        // dogsOrHigherHierarchy.add(o); // of course not!
        // since we are having a List of Dogs. Adding a type higher in the hierarchy will fail!!!

        // Can we add an Animal?
        Animal a = new Animal();

        // dogsOrHigherHierarchy.add(a); // again, of course not!
        // since we are having a List of Dogs. Adding a type higher in the hierarchy will fail!!!



    }



}
