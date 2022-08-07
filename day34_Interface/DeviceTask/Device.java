package day34_Interface.DeviceTask;

public abstract class Device {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty() || brand.isBlank()) {
            System.err.println("Brand cannot be empty!!!");
            System.exit(1);
        }
        this.brand = brand;
        if (model.isBlank() || model.isEmpty()) {
            System.err.println("Model cannot be empty!!!");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        if (price <= 0) {
            System.err.println("Price cannot be negative or zero");
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()) {
            System.err.println("Color cannot be empty!!");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
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

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
