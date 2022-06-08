package JavaLab_02;
import java.util.Scanner;
public class TrainBookingApp {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Do you have a bag?(Yes:true,No:false)");
        boolean hasBag=kb.nextBoolean();
        System.out.println("Direct transport only?(Yes:true,No:false)");
        boolean nonStop=kb.nextBoolean();

    }
}
