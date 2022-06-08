package Day19_IntroToArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00"); // format the decimal number
        Scanner kb=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter? ");
        int inputNo=kb.nextInt();
        int[] numbers=new int[inputNo];
        double total=0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter a new number : ");
            numbers[i]=kb.nextInt();
            total+=numbers[i];
        }
        double average=total/inputNo;
        System.out.println(Arrays.toString(numbers));
        System.out.println("The average of numbers you entered : "+ df.format(average)); //apply the decimal formatter to average
    }

}
