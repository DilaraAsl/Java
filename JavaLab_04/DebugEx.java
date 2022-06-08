package JavaLab_04;

public class DebugEx {
    public static void main(String[] args) {
        System.out.println("Hello");
        String name = "mike";
        int age = 20;
        if (name.equals("mike") && age == 20) {
            System.out.println("correct info");

        } else {
            System.out.println("wrong info");
        }
        for (int i = 0; i < 3; i++) {
            if (i == 2) {

                method1();
            } else {
                method2();
                System.out.println("hello");

            }
        }
    }

    private static void method2() {
        System.out.println("I am inside 2");
    }

    private static void method1() {
        System.out.println("I am inside method 1");
    }
}
