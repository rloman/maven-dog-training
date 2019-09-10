package nl.itacademy.dogtraining.stringbuilder;

public class App {

    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Stijn ");
//        builder.append("Stijn ");

        for(int i = 0;i<=10000;i++) {
            builder.append(i);
        }

        System.out.println(builder);

    }
}
