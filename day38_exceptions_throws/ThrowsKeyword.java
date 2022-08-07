package day38_exceptions_throws;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

       /* System.out.println("Program 1 started");
       // System.out.println(100 / 0);


        System.out.println("Program 1 ");*/

       /* System.out.println("Program 1 started");
        Thread.sleep(5000); // checked exception because it won't compile && main method won't be called from another method
        System.out.println("Program 1  ended");
        System.out.println("-----------------------------------------------");
        System.out.println("Program 2 started");
        Thread.sleep(7000);
        System.out.println("Program 2 ended");
        System.out.println("-----------------------------------------------");
        System.out.println("Program 3 started");
        FileInputStream files = new FileInputStream("File");
        System.out.println("Program 3 ended"); */
        //  pauseFor5seconds(); // exception not handled

        method1();
    }

    public static void pauseFor5seconds() throws InterruptedException {
        Thread.sleep(5000); // exception is ignored not handles
    }

    public static void method1() throws InterruptedException {
        System.out.println("Start of method 1");
        pauseFor5seconds();
        System.out.println("End of method 1");
    }
}
