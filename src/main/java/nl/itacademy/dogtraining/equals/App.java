package nl.itacademy.dogtraining.equals;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        {
            byte b = 15;
            short c = 15;

            if (b == c) {
                System.out.println("True voor de byte short compmaring");
            }
        }

        {
            double b = 3.0;
            float f = 3.5f;
            int c = 3;

            if (b == f) {
                System.out.println("Floatertjes zijn gelijk.");
            }
            if (c == b) {
                System.out.println("it rocks");
            }
        }

        {


            Dog a = new Dog();
            a.setChipNumber("AAB");

            Dog b = new Dog();
            b.setChipNumber("AAA");

            System.out.println(a == b); // false
            System.out.println(a.equals(b));  // false


            List<Dog> kennel = new ArrayList<>();

            kennel.add(a);
            kennel.add(b);

            System.out.println(kennel);

            Dog victim = new Dog();
            victim.setChipNumber("AAA");

            System.out.println(kennel.contains(victim));

            kennel.remove(victim);

            System.out.println(kennel);

            System.out.println(kennel.contains(victim));
        }

        {
            // String
            String a = "Piet";
            String b = "Piet";

            if (a == b) {
                System.out.println("Gaat goed");
            }


            StringBuilder builder = new StringBuilder("Pie");
            builder.append("t");

            String c = builder.toString();
            System.out.println(c);

            if(a == c) {
                System.out.println("Piet is piet");
            }
            else {
                System.out.println("Piet is piet niet");
            }

            // altijd in het echt

            if(a.equals(c)) {
                System.out.println("Piet is piet");
            }
            else {
                System.out.println("Piet is piet niet");
            }

            // goed
            if(a.equals("Piet")){
                // bij a is null pointer dan exception (boem)

            }
            // beter
            if("Piet".equals(a)) {
                // als a is null pointer dan gaat ie gewoon door (en is het resultaat van de vergelijking false)
            }
        }

    }
}
