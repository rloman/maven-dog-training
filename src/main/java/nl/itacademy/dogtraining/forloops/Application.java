package nl.itacademy.dogtraining.forloops;

import nl.itacademy.dogtraining.model.Dog;

public class Application {

    public static void main(String[] args) {
        doIt();
    }


    public static void doIt() {

        // basic loop
        for(byte i = 0;i<=15;i++) {
            System.out.println(i);
        }

        /*
        for(;;) { // same as while true ...

        }
        */

        // enhanced for

        // later

        // while

        // 0 of meer dan 1x doen
        int i = 0;
        while(i <=15) {
            System.out.println(i);
            i++;
        }

        /*
        while(true) {

        }
        */

        // 1 of meer dan  1x doen
        int age = 100;
        do {
            System.out.println("In de do:"+age);
            age++;
        } while(age < 50);

    }
}
