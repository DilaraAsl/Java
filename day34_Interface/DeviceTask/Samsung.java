package day34_Interface.DeviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApp {
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
