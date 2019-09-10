package nl.itacademy.dogtraining.exceptions.handleOrDeclare;


// this class shows the Declare of the principle Handle or Declare
// Handle::= try ... catch
// Declare::= throws
public class App {

    public static void main(String[] args) {
        try {
            foo();
        } catch (MyCheckedException e) {
            e.printStackTrace();
            System.out.println("Exception afgevangen, dus afgehandeld (?) en programma loopt door!");
        }
    }


    public static void foo() throws MyCheckedException {
            bar();
    }


    public static void bar() throws MyCheckedException {

        throw new MyCheckedException();

    }
}




class MyCheckedException extends Exception {

}