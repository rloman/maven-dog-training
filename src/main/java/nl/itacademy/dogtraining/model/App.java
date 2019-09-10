package nl.itacademy.dogtraining.model;

public class App {

    public static void main(String[] args) {
        Dog dexter = new Dog();

        Dog other = new Dog();

//        double hamburgerGegeten = other.eat();


        dexter.setAge(7);
        dexter.setMale(true);

        System.out.println(dexter.getName());


        dexter.setBreed("Nova Scotia Duck Tolling Retriever");


        System.out.println(dexter.getBreed());
        if (dexter.isMale()) {
            System.out.println("Dexter is een reu");
        } else {
            System.out.println("Dexter is een teef");
        }

        dexter.eat("Meat");

        Dog d = new Dog();
        d.eat("Meat");

        Dog dogje = new Dog();
        System.out.println(dogje.getName());

        String label = dogje.toString();
    }
}