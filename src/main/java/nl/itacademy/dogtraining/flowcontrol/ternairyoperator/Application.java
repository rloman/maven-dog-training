package nl.itacademy.dogtraining.flowcontrol.ternairyoperator;

public class Application {

    public static void main(String[] args) {

        int age = 50;

        String label = age < 50 ? "Jong" : "Ouder";

        System.out.println(label);

        label = age < 50 ? "Jong" : age < 75 ? "Wat aan de oudere kant": "Ouder";

    }
}
