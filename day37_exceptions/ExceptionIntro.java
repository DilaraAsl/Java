package day37_exceptions;

public class ExceptionIntro {
    public static void main(String[] args) {
        String str = "java";
        // char ch = str.charAt(250);
        // System.out.println(ch);
        //   Pizza pizza = null;
        //   pizza.calcCost();
        //   System.out.println("Hello World");
        // System.out.println(50 / 0);// unchecked exception

        int score = 100;
        if (score > 58) {
            System.out.println("Your grade is 0");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }
    }
}
