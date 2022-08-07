package day37_exceptions;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza('M', 0, 2);
        Pizza myPizza2 = new Pizza('M', 0, 2);
        Object obj = new Pizza('M', 0, 2);
        System.out.println(myPizza.equals(myPizza2));
        // System.out.println(myPizza.equals(100)); no compile error it will accept anything
        double total = ((Pizza) obj).calcCost();
        System.out.println(total);
    }
}
