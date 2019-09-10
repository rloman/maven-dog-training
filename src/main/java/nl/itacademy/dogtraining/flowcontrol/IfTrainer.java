package nl.itacademy.dogtraining.flowcontrol;

public class IfTrainer {

    public static void main(String[] args) {

        int age = 100;

        if (age < 100) {
            System.out.println("Pretty jong");
        } else {
            System.out.println("Pretty old");
        }

        if (age < 25) {
            System.out.println("Jeugdig!");
            System.out.println("Van harte met je 25e");
        }

        int maandNummer = 3;

        int aantalDagenInDeMaand = 0;
/*
        if(maandNummer == 1) {
            aantalDagenInDeMaand = 31;
        }
        else {
            if(maandNummer == 2) {
                aantalDagenInDeMaand = 28;
            }
            else {
                if(maandNummer == 3) {
                    aantalDagenInDeMaand = 31;
                }
                else {
                    if(maandNummer == 4) {
                        aantalDagenInDeMaand = 30;
                    }
                }
            }
        }

        */


        switch (maandNummer){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                aantalDagenInDeMaand = 31;

                break;
            case 2:
                aantalDagenInDeMaand = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                aantalDagenInDeMaand = 30;
                break;

            default:
                System.out.println("Dat is een ongeldig maandnummer");

                return;
        }

        System.out.println(aantalDagenInDeMaand);
    }
}
