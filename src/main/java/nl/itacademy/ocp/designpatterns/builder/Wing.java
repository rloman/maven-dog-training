package nl.itacademy.ocp.designpatterns.builder;

public class Wing {

    private int length;
    private int width;

    private int maxWeightToCarry;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMaxWeightToCarry() {
        return maxWeightToCarry;
    }

    public void setMaxWeightToCarry(int maxWeightToCarry) {
        this.maxWeightToCarry = maxWeightToCarry;
    }
}
