package practice_JavaLab13;

import java.util.Scanner;

import static practice_JavaLab13.DataGenerator.*;

public class Main {
    public static void main(String[] args) {

        createCustomer();
        createCategory();
        createProduct();


        //TODO Select user
        //TODO Print menu options. (Menu should be printed until exit option is selected)
        System.out.println("0-List Categories");
        System.out.println("1-List Products");
        System.out.println("2-List Discounts");
        System.out.println("3-List Categories");


    }

    public static void printMenu() {
        System.out.println("Enter a selection");
        Scanner kb = new Scanner(System.in);
        int selection = kb.nextInt();

    }

}
