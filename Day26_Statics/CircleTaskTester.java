package Day26_Statics;



public class CircleTaskTester {
    public static void main(String[] args) {
        Circle c1=new Circle(3.0);
        c1.calcPerimeter();
        c1.calcArea();
        System.out.println(c1.toString());
       Circle.printPi();
    }
}
