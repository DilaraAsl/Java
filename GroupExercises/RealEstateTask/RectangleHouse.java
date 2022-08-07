package GroupExercises.RealEstateTask;

public class RectangleHouse extends Property {
    private int length;
    private int width;

    public RectangleHouse(String name, int width, int length) {
        super(name);
        setWidth(width);
        setLength(length);

    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.err.println("Invalid length ");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.err.println("Invalid width ");
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }
}
