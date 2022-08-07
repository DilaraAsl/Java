package day27_AccessModifiers;

public class Car {
    public String make,model,color;
    public int year;
    public double price;

    public static int wheels=4;
    public class CarEngine{
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }

    public static class StaticInnerClass{
        public void method(){
          //  System.out.println(make); instance variable not static compile error
            System.out.println(wheels);
        }
    }
}
