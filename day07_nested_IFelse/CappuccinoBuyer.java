package day07_nested_IFelse;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";

        if (size=="tall"){
            System.out.println("Price $3.69 & calories 90");
        }
        else if(size=="grande"){
            System.out.println("Price $3.99 & calories 120");
        }
        else if(size=="venti"){
            System.out.println("Price is $4.29 & calories 150");
        }
        else System.out.println("invalid entry");
    }
}