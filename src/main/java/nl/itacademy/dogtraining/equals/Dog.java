package nl.itacademy.dogtraining.equals;

public class Dog extends Animal {

    private String chipNumber;

    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    @Override
    public boolean equals(Object o) {

        Dog other = (Dog) o;

        return this.getChipNumber().equals(other.getChipNumber());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "chipNumber='" + chipNumber + '\'' +
                "} ";
    }
}
