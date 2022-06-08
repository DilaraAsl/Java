package replitExercises;
import java.util.*;
public class computerParts {


        public static void main(String[] args) {
            Scanner kb=new Scanner(System.in);
            int totalPrice=0;
            System.out.println("Select screen size:");
            String screen=kb.next();
            if(screen.equals("13.3")) totalPrice+=200;
            System.out.println(totalPrice);
            if(screen.equals("15.0")) totalPrice+=300;
            if(screen.equals("17.3")) totalPrice+=400;
            System.out.println("Select CPU type:");
            String cpu=kb.next();
            if(cpu.equals("i3")) totalPrice+=150;
            System.out.println(totalPrice);
            if(cpu.equals("i5")) totalPrice+=250;
            if(cpu.equals("i7")) totalPrice+=350;

            System.out.println("Select RAM size:");
            int ramSize=kb.nextInt();

            totalPrice=totalPrice+(50*(ramSize/4));
            System.out.println(totalPrice);
            System.out.println("Select storage type:");
            String storageType=kb.next();
            System.out.println("Select storage size:");
            int storageSize=kb.nextInt();
            if(storageType.equals("HDD"))
                totalPrice=totalPrice+50*(storageSize/500);
            if(storageType.equals("SSD"))
                totalPrice=totalPrice+100*(storageSize/500);

            System.out.println("Select screen resolution:");
            String resolution=kb.next();
            if(resolution.equals("FullHD")) totalPrice+=100;
            if(resolution.equals("4K")) totalPrice+=200;
            System.out.println("Final price is: $"+totalPrice+".0");


        }
    }

