package nl.itacademy.dogtraining.model;

public class Dog extends Animal {

    // fields // instance variables
    private String breed;
    private int age;
    private boolean isMale;
    private double weight;


    double seat() {

        DogDoctor doctor = new DogDoctor();
        doctor.print(this);


        return this.weight;
    }

    void eat(String food) {
        System.out.println("Eating dog <= "+food);
        this.weight += 0.1;
    }

    void eat(int weightDelta){
        this.weight += weightDelta;

        System.out.println(testProtected());
    }

    void sleep() {
        this.weight -= 0.02;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}