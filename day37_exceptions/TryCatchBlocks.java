package day37_exceptions;


public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("program started");
        String str = null;
        try {
            System.out.println(str.toLowerCase());
            //System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
        }
        try {
            Thread.sleep(5000);
            System.out.println("Try block");
        } catch (InterruptedException e) {
            System.out.println("Catch block caught the exception");
        }
        System.out.println("program ended");
    }

}

