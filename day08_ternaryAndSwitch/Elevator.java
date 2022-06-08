package day08_ternaryAndSwitch;

public class Elevator {
    public static void main(String[] args) {
        int elevator = 1;
        String x = (elevator == 1) ? "Apple" : "Cydeo";
        System.out.println(x);
        boolean a, b;
        a = true;
        b = false;
        int m = 200;
        System.out.println(a && b ? m * m : -m);
        String toy = "Barbie";
        double price = 20.12;
        String s = (toy.equals("Barbie")) ? (price > 20.12) ? "maybe" : "yes" : "no way";

        System.out.println(s);
    }

}
