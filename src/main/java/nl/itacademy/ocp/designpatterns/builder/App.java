package nl.itacademy.ocp.designpatterns.builder;

public class App {

    public static void main(String[] args) {

        Airplane.AirplaneBuilder builder = new Airplane.AirplaneBuilder("Boeing");

        Airplane plane = builder.type("747").tank(255).wing(10,5).wing(5,13).wing(34,55).build();

        System.out.println(plane);

        System.out.println( plane.getBrand());

        Airplane plane2 = builder.build();

        System.out.println(plane2);

        System.out.println(plane2.getWings());
    }
}
