package day32_finalKeyWord.CarTaskMethodOverriding;

public class CarTester {
    public static void main(String[] args) {
        Tesla myCar = new Tesla("Model S", "Black", 2008, 500000);
        System.out.println(myCar);
        myCar.start();
    }
}
