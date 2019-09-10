package nl.itacademy.dogtraining.interfaces;

public class App {

    public static void main(String[] args) {
        Televisie tv = new Samsung();

        tv.on();

        tv.switchChannel(3);

        // even wachten ...

        tv.off();
    }
}
