package by.semashko.model;

public class Product {

    private String title;
    private double percent;
    private double weightPortionDay;
    private double weight;

    public Product(String title, double percent) {
        this.title = title;
        this.percent = percent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getWeightPortionDay() {
        return weightPortionDay;
    }

    public void setWeightPortionDay(double weightPortionDay) {
        this.weightPortionDay = weightPortionDay;
    }
}
