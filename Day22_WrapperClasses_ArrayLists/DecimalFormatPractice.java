package Day22_WrapperClasses_ArrayLists;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(df.format(5.678));

    }
}
