package Day17_CustomClasses;


import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String reserveMore = "yes";
        while (reserveMore.equalsIgnoreCase("yes")) {
            System.out.println("Enter a room : King-1 Queen-2 Single 0");
            int roomChoice = kb.nextInt();
            System.out.println("How many nights would you like to stay? ");
            int noOfDays = kb.nextInt();
            System.out.println("Would you like to reserve another room? yes or no");
            reserveMore = kb.next();
            while (!(reserveMore.equalsIgnoreCase("yes") || reserveMore.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry");
                System.err.println("Would you like to reserve another room? yes or no");
                reserveMore = kb.next();

            }


        }
        System.out.println("Have a nice day!!!");
    }
}