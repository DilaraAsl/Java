package day27_AccessModifiers;

public class CarNestedClassTester {
    public static void main(String[] args) {
        Car myCar=new Car();
        Car.CarEngine myEngine=myCar.new CarEngine();
Car.StaticInnerClass obj1=new Car.StaticInnerClass();
    }
}
