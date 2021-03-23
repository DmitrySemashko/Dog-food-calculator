package by.semashko.model;

import java.util.Objects;

public class Dog {

    private Double weight;
    private Double percentWeight;

    public Dog(double weight, double percentWeight) {
        this.weight = weight;
        this.percentWeight = percentWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Double getPercentWeight() {
        return percentWeight;
    }

    public void setPercentWeight(double percentWeight) {
        this.percentWeight = percentWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.getWeight(), getWeight()) == 0 &&
                Double.compare(dog.getPercentWeight(), getPercentWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getPercentWeight());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", percentWeight=" + percentWeight +
                '}';
    }
}
