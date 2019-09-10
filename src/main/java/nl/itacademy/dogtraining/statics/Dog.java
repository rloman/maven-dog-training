package nl.itacademy.dogtraining.statics;

public class Dog {

    public static int dogCounter = 0;

    public static final double TAX = 120.00;

    private String name;
    private int age;

    public Dog() {
        dogCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
