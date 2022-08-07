package day34_Interface.CarTask;

public class CarTester {
    public static void main(String[] args) {
        Honda myHonda = new Honda("Honda", "Green", 22020, 5500);
        System.out.println(myHonda);
        myHonda.start();
    }
}
