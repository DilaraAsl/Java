package Day17_CustomClasses;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rec1=new Rectangle(4,9);
        System.out.println(rec1.toString());
        System.out.println("Area: "+rec1.calcArea());
        System.out.println("Perimeter: "+rec1.calcPer());
        System.out.println(rec1.toString());
    }
}
