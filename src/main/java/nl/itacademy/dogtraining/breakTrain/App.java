package nl.itacademy.dogtraining.breakTrain;

public class App {

    public static void main(String[] args) {
        int i = 0;

        while(true) {

            i++;
            if(i == 13) {
                continue;
            }
            System.out.println(i);
            if(i > 100) {
                break;
            }
        }
    }
}
