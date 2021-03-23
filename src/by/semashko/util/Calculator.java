package by.semashko.util;

import by.semashko.model.DailyPortion;
import by.semashko.model.Dog;

public class Calculator {

    public static double calculate(Dog dog){
        if (dog.getWeight() >= 0.0D && dog.getPercentWeight() > 0.0D) {
            return dog.getWeight() * dog.getPercentWeight() / 100.0D * 1000.0D;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public static double calculateWeightProduct(double percent, DailyPortion dailyPortion) {
        return percent * dailyPortion.getWeight() / 100.0D;
    }
}
