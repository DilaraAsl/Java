package JavaLab_07_ClassesAndObjects;

public class CarTester {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2004, "beige", 5000);
        car1.drive();
        System.out.println(car1.toString());
    }
}
