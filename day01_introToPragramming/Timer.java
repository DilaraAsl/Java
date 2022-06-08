package day01_introToPragramming;
import java.io.*;
import java.util.*;
public class Timer {
    public static void main(String[] args)throws InterruptedException {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter the time in minutes");
        int time=keyboard.nextInt();
        keyboard.close();

        for (int i=time;i>0;i--){
                for(int j=59;j>0;j--)
                {
                    System.out.print( "\r"+(i-1)+" minutes and "+j+" seconds left");
                    Thread.sleep(1000);

                }

        }
        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up!                              *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
}
/* public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();

        scan.close();

        for (int i=minutes; i > 0 ;i--) {
            for (int z=59; z >=0 ;z--){
                System.out.print( "\r"+(i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(1000);
            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
*/