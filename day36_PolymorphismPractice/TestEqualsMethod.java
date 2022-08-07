package day36_PolymorphismPractice;

public class TestEqualsMethod {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);
        System.out.println(circle1 == circle2); //hash codes compared will return FALSE
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
        // System.out.println(circle1.equals("Java")); // String object not  a Circle object NOT giving a compile error
        // because String is an object
        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);
        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);
        System.out.println(iphone1.equals(iphone2));
        //System.out.println(iphone1.equals(circle1)); // not a phone object
    }
}
