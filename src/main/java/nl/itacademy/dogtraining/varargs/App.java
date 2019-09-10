package nl.itacademy.dogtraining.varargs;

public class App {

    public static void main(String[] args) {
        int grootste = max(3,4,5, 2, 34, 12);

        System.out.println(grootste);
    }

    public static int max(int first, int ... rest) { // numbers is here verstopt als array
        // first now is: 3
        // rest now is: 4,5,2,34,12

        int max = first;
        for(int element: rest) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }
}
