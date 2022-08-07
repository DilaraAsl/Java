package day32_finalKeyWord.CarTaskMethodOverriding;

public class Car {
    private String make, model, color;
    private int year;
    private double price;
    private static int numberOfWheels;
    private static boolean hasBattery;

    static {
        numberOfWheels = 4;
        hasBattery = true;
    }


    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName());// setting the class name as the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }


    public void start() {
        System.out.println("Press the brake and twist the key to ignition");
    }

    public final void printCarName() {
        System.out.println(getClass().getSimpleName());
    }

    public String toString() {
        return getClass().getSimpleName() +
                " make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year + "number of wheels " + numberOfWheels +
                '}';
    }
}
/*1. Create a class named Car
        Variables:
        make, model, color, year, price, numberOfWheels (static), hasBattery (static)

        Encapsulate all the fields
        Condition:
        1. year can not be negative or zero
        2. price can not be negative or zero

        Add a constructor that can set all the fields
        note: make of the car can be set to the class name

            Methods:
        start(): "Press the brake and twist the key to ignition"

        toString()

        2. Create the following sub classes and override the start() method if needed:

        1. Toyota
        start(): "Press the brake and twist the key to ignition"

        2. Honda
        start(): "Press the brake and twist the key to ignition"

        3. Audi
        start(): "Press the start button"

        4. BMW
        start(): "Call the mechanic or jump start "

        5. Tesla
        start(): "Say \"Start\""

        Extra method:
        autoPilot() */

