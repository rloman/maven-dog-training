package nl.itacademy.ocp.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Airplane {

    private String type;
    private String brand;
    private double weight;
    private double price;
    private Tank tank;


    private List<Wing> wings;

    public Airplane(AirplaneBuilder builder){
        this.type = builder.type;
        this.brand = builder.brand;
        this.weight = builder.weight;
        this.price = builder.price;
        this.tank = builder.tank;
        this.wings = builder.wings;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public Tank getTank() {
        return tank;
    }

    public List<Wing> getWings() {
        return wings;
    }

    public static class AirplaneBuilder {

        private String type;
        private String brand;
        private double weight;
        private double price;
        private Tank tank;


        private List<Wing> wings = new ArrayList<>();

        public AirplaneBuilder(String brand) {
            this.brand = brand;
        }


        public AirplaneBuilder type(String type) {
            this.type = type;

            return this;
        }

        public AirplaneBuilder tank(double currentLevel){
            Tank tank = new Tank();
            tank.setCurrentLevel(currentLevel);

            this.tank = tank;

            return this;
        }

        public AirplaneBuilder wing(int length, int width) {
            Wing wing = new Wing();
            wing.setLength(length);
            wing.setWidth(width);

            this.wings.add(wing);

            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }

    }
}
