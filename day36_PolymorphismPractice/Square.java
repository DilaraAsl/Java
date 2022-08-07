package day36_PolymorphismPractice;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            System.err.println("invalid object");
            System.exit(1);
        }
        if (side == (((Square) obj).side)) {
            return true;
        }
        return false;
    }
}
