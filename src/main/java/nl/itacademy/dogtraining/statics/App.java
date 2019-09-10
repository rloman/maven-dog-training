package nl.itacademy.dogtraining.statics;

public class App {

    public static void main(String[] args) {

        Dog d = new Dog();
        Dog e = new Dog();
        System.out.println(e.dogCounter);
        Dog f = new Dog();
        System.out.println(e.dogCounter);


        System.out.println(Dog.dogCounter);

        System.out.println(e.dogCounter);

        System.out.println(Dog.TAX);

//        Dog.TAX = 10; // compile error!!!
//e.TAX = e.TAX / 12; // compile error
        System.out.println(e.TAX / 12);
        System.out.println(Dog.dogCounter * Dog.TAX);

        // usage of a static method

//        DogFactory dogFactory = new DogFactory();
        Dog dog = DogFactory.getDog("Wodan", 33);
        Dog oscar = DogFactory.getDog("Oscar", 7);

        System.out.println(dog.getAge());
        System.out.println(oscar.getName());

        System.out.println(Math.PI);

        System.out.println(Math.pow(2,3));

        System.out.println(Integer.MAX_VALUE);


        System.out.println(Math.E);

        System.out.println(Math.random());
    }
}
