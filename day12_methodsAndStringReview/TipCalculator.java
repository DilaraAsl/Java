package day12_methodsAndStringReview;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the check amount:");
        double totalAmount = kb.nextDouble();
        System.out.println("split or no split:");
        String split = kb.next().trim();
        split = split.toLowerCase();
        double nOfPeople=1;
        double priceSplit=totalAmount;
        if (split.equals("yes")) {
            System.out.println("amount of people:");
             nOfPeople = kb.nextDouble();
            priceSplit/=nOfPeople;
        }
        System.out.println("How was service quality?excellent,great,good,fair,poor");
        String quality = kb.next().trim();
        quality = quality.toLowerCase();
        double tipAmount=(quality.equals("excellent"))?totalAmount*0.25
                :(quality.equals("great"))?totalAmount*0.20
                :(quality.equals("good"))?totalAmount*0.15
                :(quality.equals("fair"))?totalAmount*0.1
                :totalAmount*0.05;

        kb.close();
        System.out.println("Number of people:"+nOfPeople);
        System.out.println("total check amount:"+totalAmount);
        System.out.println("price split: "+(totalAmount/nOfPeople));
        System.out.println("tip:"+(tipAmount/nOfPeople));




    }
}
