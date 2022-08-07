package day28_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyTaskTester {
    public static void main(String[] args) {
       ArrayList<Candy> candyList=new ArrayList<>(Arrays.asList(new Candy("mars",4,2,true),
               new Candy("ferrrero",12,10,false),new Candy("dove",1,0,false),
               new Candy("turkish delight", 1,20,false)));
        System.out.println(candyList);

        for (Candy candy : candyList) {
            System.out.println("Brand : "+candy.getBrand()+ " Price :"+candy.getPrice());
        }
    }
}
