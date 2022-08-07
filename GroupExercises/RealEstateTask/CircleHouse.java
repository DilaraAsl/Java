package GroupExercises.RealEstateTask;

public class CircleHouse extends Property {
    private int radius;
    private static final double pi = 3.14;

    public CircleHouse(String name, int radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            System.err.println("invalid radius");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }


}
