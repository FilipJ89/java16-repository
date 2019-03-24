package pl.advanced1.lambda.files;

public class Alcohol {

    private String type;
    private String brand;
    private int voltage;
    private double price;
    private boolean isTasty;

    public Alcohol(String type, String brand, int voltage, double price, boolean isTasty) {
        this.type = type;
        this.brand = brand;
        this.voltage = voltage;
        this.price = price;
        this.isTasty = isTasty;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", voltage=" + voltage +
                ", price=" + price +
                ", isTasty=" + isTasty +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getVoltage() {
        return voltage;
    }

    public double getPrice() {
        return price;
    }

    public boolean isTasty() {
        return isTasty;
    }
}
