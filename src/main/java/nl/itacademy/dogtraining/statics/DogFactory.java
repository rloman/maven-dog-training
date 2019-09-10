package nl.itacademy.dogtraining.statics;

public class DogFactory {

    public static Dog getDog(String name, int age) {
        Dog result = new Dog();
        result.setAge(age);
        result.setName(name);

        return result;
    }
}
