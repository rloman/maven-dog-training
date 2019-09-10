package nl.itacademy.dogtraining.arrays;

public class App {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        int[] andereGetallen = new int[]{1,2,3};

        int[] nogAndereGetallen = {11,12,13,14,15};

        int sum = 0;
        for(int element: nogAndereGetallen) {
            sum += element;
        }


        // Ik kan ook arrays maken dus met primitiven.

        String[] names = {"Pieter", "Eva", "Maaike", "Ward", "Natasja", "Stijn", "Nick"};


        // basic / boeren manier
        for(int i = 0;i<names.length;i++) {
            System.out.println("Een naam van een cursist is: "+names[i]);
        }

        System.out.println("Nu de enhanced for => ");

        // enhanced
        for(String eenNaam : names) {
            System.out.println("Een naam van een cursist is: "+eenNaam);
        }


        int[][] boterKaasEnEieren = new int[3][3];

        boterKaasEnEieren[1][1] = 1;

        // rubics cube

        int[][][] kubus = new int[3][3][3];
    }
}
