package day36_PolymorphismPractice;

import Day30_Inheritance.CellPhoneTask.CellPhone;
import Day30_Inheritance.CellPhoneTask.IPhone;
import Day30_Inheritance.CellPhoneTask.Nokia;
import Day30_Inheritance.CellPhoneTask.Samsung;

public class PolymorphismPractice {


    public static void main(String[] args) {

        CellPhone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Red", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };

        for (CellPhone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + "-" + eachPhone.getColor() + "-" + eachPhone.getPrice());

        }
        int countIphone = 0;
        int countSamsung = 0;
        for (CellPhone eachPhone : phones) {
            if (eachPhone instanceof IPhone) {
                countIphone++;
            }
        }
        for (CellPhone eachPhone : phones) {
            if (eachPhone instanceof Samsung) {
                countSamsung++;
            }
        }
        System.out.println("No of iphones:" + countIphone);
        System.out.println("No of Samsungs:" + countSamsung);

        for (CellPhone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung) {
                if (each.getPrice() >= 700) {
                    System.out.println(each.getModel());
                }
            }

        }

    }

    {

    }
}

