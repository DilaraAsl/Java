package JavaLabs;

public class CoinChange {
    public static void main(String[] args) {
        int coin=99;
        int quarter=coin/25;// number of quarters
        int remain=coin%25;// remaining cents
        int dime=remain/10; // number of dimes
        remain=remain%10; //remaining cents
        int nickel=remain/5;//number of nickels
        remain=remain%5;
        int pennies=remain;
        System.out.println(quarter+ " quarters");
        System.out.println(dime+" dimes");
        System.out.println(nickel+" nickles");
        System.out.println(pennies+" pennies");
    }
}
