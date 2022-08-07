package day36_PolymorphismPractice;

import java.util.Objects;

public class Circle {
    private double radius;

    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + area() +
                '}';
    }


    // .equals()

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) { // if the specified obj is not circle we should not compare them
            System.err.println("Invalid object");
            System.exit(1);
        }
        if (radius == ((Circle) obj).radius) { // if the current circle's radius is equal to the given circle's radius then two circles are equal
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
