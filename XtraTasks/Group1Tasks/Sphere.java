package XtraTasks.Group1Tasks;

public class Sphere {

    // pi is a universal constant, about as constant as anything can be.
    public static final double PI = 3.141592653589793;

    public final double radius;
    public final double xPos;
    public final double yPos;
    public final double zPos;

    Sphere(double radius, double xPos, double yPos, double zPos) {
        if (radius < 0) System.out.println("Radius cannot be negative");
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "radius=" + radius +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", zPos=" + zPos +
                '}';
    }
}
