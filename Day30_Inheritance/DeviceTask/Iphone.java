package Day30_Inheritance.DeviceTask;

public class Iphone extends Phone {


    public Iphone(String model, String color, char size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
