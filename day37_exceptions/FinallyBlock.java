package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occurred");
            e.printStackTrace();
            //  System.exit(0);
        } finally {
            System.out.println("Finally block");
        }
    }
}
