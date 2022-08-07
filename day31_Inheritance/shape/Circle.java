package day31_Inheritance.shape;

public class Circle extends Shape {

    private static double pi = 3.14;
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("It is hard to draw a circle...");
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius=" + radius;
    }
}
