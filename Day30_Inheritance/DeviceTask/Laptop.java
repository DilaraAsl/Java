package Day30_Inheritance.DeviceTask;

public class Laptop extends Computer {
    public Laptop(String brand, String model, String color, char size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
}
