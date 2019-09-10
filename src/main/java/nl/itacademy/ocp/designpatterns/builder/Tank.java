package nl.itacademy.ocp.designpatterns.builder;

public class Tank {

    private double currentLevel;
    private double minLevel;

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    public double getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(double minLevel) {
        this.minLevel = minLevel;
    }
}
