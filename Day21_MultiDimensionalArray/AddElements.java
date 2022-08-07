package Day21_MultiDimensionalArray;

import utilities.ArrayUtility;

import java.util.ArrayList;
import java.util.Arrays;

import static utilities.ArrayUtility.merge;

public class AddElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(ArrayUtility.addElement(array, 12)));

        System.out.println("____________________________________________________");

        String data = "BBB";
        String id = "2";
        String op = "add";
        String db = "1etsy#2wooden#3spoon";
        // 1etsy 2wooden 3spoon
        String[] temp = db.split("#");

        int index=Integer.parseInt(id)-1;
        System.out.println(index);
        // etsy wooden spoon stored in the array
        for (String each:temp) {
            each=each.substring(1);
        }
        System.out.println(Arrays.toString(temp));
        String[] temp1=Arrays.copyOfRange(temp,0,index);

        System.out.println(Arrays.toString(temp1));
        String[] temp2=Arrays.copyOfRange(temp,index,temp.length);
        System.out.println(Arrays.toString(temp2));

        String newStr="";
        for (int i = 0; i < temp1.length; i++) {
            newStr+=(i+1)+temp1[i]+"#";
        }
        System.out.println(newStr);
        newStr+=newStr+id+data;
        System.out.println(newStr);

        for (int i = index+1; i < temp2.length+index; i++) {
            newStr+=i+temp[i-index]+"#";
        }

        System.out.println(newStr);
        }
    }


