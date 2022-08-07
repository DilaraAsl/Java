package day34_Interface.DeviceTask;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);

    }


    public void call(long phoneNumber) {
        System.out.println(getBrand() + " is calling this number: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " is texting this number: " + phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
