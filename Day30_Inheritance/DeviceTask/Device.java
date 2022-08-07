package Day30_Inheritance.DeviceTask;

public class Device {
    private String brand;
    private String model;
    private String color;
    private char size;
    private double price;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand == null) {
            System.out.println("invalid brand ");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model == null) {
            System.out.println("invalid model ");
            System.exit(1);
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid price ");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn() {
        System.out.println(brand + " is turned on");
    }

    public void turnOff() {
        System.out.println(brand + " is turned off");
    }

    public Device(String brand, String model, String color, char size, double price, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String toString() {
        return getClass().getSimpleName() + " {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton;
    }
}