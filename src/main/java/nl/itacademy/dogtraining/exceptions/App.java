package nl.itacademy.dogtraining.exceptions;

public class App {


    public static void main(String[] args) {

        String s = null;

        System.out.println(s.length());


        try {
            int result = divide(6, 3);
            System.out.println(result);
        } catch (KasteelException ke) {
            System.out.println("Gevangen kasteel Exc");
        }

        try {
            int result = divide(-3, 0);
            System.out.println(result);
        } catch (KasteelException | ArithmeticException | IllegalArgumentException alles) {
            System.out.println("Diverse types gevangen!");
            System.out.println(alles.getMessage());
        }
        catch(Exception unknownType) {
            // bijna crimineel!
        }
        finally {
            // in het wild bedoeld voor het sluiten van bestanden en zo ...
            System.out.println("Einde van de catch blocks. Dus dit block wordt ALTIJD uitgevoerd, " +
                    "dus ook als de try successful is" +
                    "," +
                    "behalve als ik de stroom uitzet of System.exit() doe!!!");
        }


        System.out.println("Einde programma");

    }

    public static int divide(int a, int b) throws KasteelException {
        if (b != 0) {
            return a / b;
        } else {
            if (a == -1) {
                throw new KasteelException();
            }
            else {
                throw new ArithmeticException("Ongeldig want a != -1 of een andere tekst!");
            }

        }
    }
}
