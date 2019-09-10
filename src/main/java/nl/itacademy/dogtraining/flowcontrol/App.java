package nl.itacademy.dogtraining.flowcontrol;

public class App {


    public static void main(String[] args) {

        int a = 3;

        a++;

        System.out.println(a);

        System.out.println(a);

        int b = -a;

        int product = a*b;

        int age = 50;


        if(age < 50) {
            System.out.println("Oudere jongere");
        }

        if (age > 80) {

            System.out.println("U bent redelijk op leeftijd!");
        }


        int c = a & b;

        c  = c +5; // is the same is

        c += 5;







    }
}
