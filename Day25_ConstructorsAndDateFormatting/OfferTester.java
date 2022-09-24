package Day25_ConstructorsAndDateFormatting;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferTester {
    public static void main(String[] args) {
        ArrayList<Offer> myOffers=new ArrayList<>(Arrays.asList(new Offer("California","Developer",80000,true),
                new Offer("Texas","Teacher",65000,false),
                new Offer("Arizona","IT",120000,true)));
        ArrayList<Offer> fullTimeOffers=myOffers;
        fullTimeOffers.removeIf(p->!p.isFullTime);
        System.out.println(fullTimeOffers);
        ArrayList<Offer> bigSalary=myOffers;
        bigSalary.removeIf(p->p.salary<80000);
        System.out.println(bigSalary);


    }
}
