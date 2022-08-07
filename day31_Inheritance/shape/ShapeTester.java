package day31_Inheritance.shape;

public class ShapeTester {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Circle circle = new Circle(4);
        System.out.println(circle);
    }
}
