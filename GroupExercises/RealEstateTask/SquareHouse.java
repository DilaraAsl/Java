package GroupExercises.RealEstateTask;

public class SquareHouse extends Property {
    private int side;

    public SquareHouse(String name, int side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            System.err.println("Invalid side measurement");
            System.exit(1);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
