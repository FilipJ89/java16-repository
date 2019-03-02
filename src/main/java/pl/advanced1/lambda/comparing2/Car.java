package pl.advanced1.lambda.comparing2;

import java.time.LocalDate;
import java.time.Year;

public class Car {

    private String color;
    private String brand;
    private String type;
    private double capacity;
    private Year yearOfProduction;

    public Car(String color, String brand, String type, double capacity, Year yearOfProduction) {
        this.color = color;
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", yearOfProduction=" + yearOfProduction +
                '}' + "\n";
    }
}
