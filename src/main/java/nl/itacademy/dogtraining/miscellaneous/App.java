package nl.itacademy.dogtraining.miscellaneous;

public class App {

    public static void main(String[] args) {

        bar(false);

    }

    public static void bar(boolean isOn) {

        if(isOn = true) { // !!!! PAS op dit is geen test maar een assignment!!!
            System.out.println("TV gaat on!!!");
        }
        else {
            System.out.println("TV gaat uit!");
        }
    }
}
