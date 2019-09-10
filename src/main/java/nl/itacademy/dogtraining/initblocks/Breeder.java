package nl.itacademy.dogtraining.initblocks;

import nl.itacademy.dogtraining.model.Dog;

import java.time.LocalDate;

// this class is an even spreading breeder
// it creates Female dogs on odd days and Male dogs on even days
public class Breeder {

    private static boolean sexe;
    private  String name;

    private int age;

    // static init block
    static {
        System.out.println("Static block 1");
        if(LocalDate.now().getDayOfMonth() %2 == 0) {
            sexe = true;
        }
        else {
            sexe = false;
        }
    }

    static {
        System.out.println("Static block 2");
    }

    static {
        System.out.println("Static block 3");
    }

    // init block (per instance)
    {
        this.age = LocalDate.now().getDayOfMonth();
        System.out.println("Init block 1");
    }

    {
        System.out.println("Init block 2");
    }


    public Breeder() {

        System.out.println("Default constructor");

    }

    public Breeder(String name) {
        this.name = name;
    }

    public Breeder(double price) {

    }

    public static Dog getDog() {

        Dog d = new Dog();
        d.setMale(sexe);

        return d;

    }


}
