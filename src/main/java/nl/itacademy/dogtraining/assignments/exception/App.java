package nl.itacademy.dogtraining.assignments.exception;

public class App {

    public static void main(String[] args) {

        String s = "aap";
        if(isValidNumber(s)){
            System.out.println("S is a valid number");
        }
        else {
            System.out.println("S is NOT a valid number");
        }

    }

    public static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);

            return true;
        }
        catch(NumberFormatException nfe) {

            return false;
        }
    }
}
