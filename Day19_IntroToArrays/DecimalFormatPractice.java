package Day19_IntroToArrays;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.000"); // rounds the number to the hundredth
        double n1=10.587654;
        System.out.println(df.format(n1));
    }
}
