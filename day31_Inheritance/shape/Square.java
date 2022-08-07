package day31_Inheritance.shape;

public class Square extends Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public Square(int side) {
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t*****");
        System.out.println("\t*****");
        System.out.println("\t*****");

    }

    @Override
    public String toString() {
        return super.toString() +
                " side=" + side +
                '}';
    }
}
