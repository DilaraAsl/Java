package day31_Inheritance.shape;

public class Shape {
    private String name;

    public Shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void draw() {
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return " name: " + name + "\t Area: " + area() + "\t Perimeter: " + perimeter();
    }
}
