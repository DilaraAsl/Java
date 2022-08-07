package Day20_ArraysUtilityClass;

import java.util.ArrayList;

public class ReplitLameDB {
    public static void main(String[] args) {
        String newString = "";
        String op = "add";
        String id = "3";
        String db = "1etsy#2wooden#3spoon";
        String data = "BBB";
        String[] temp = db.split("#");
        // String[] values=new String[temp.length];
        // find the position of id in the String
        int pointer = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].contains(id)) {
                pointer = i;

            }

        }
        // clean up the numbers in front of the items
        System.out.println(pointer);

    //add new data to the pointer

        ArrayList<String> newTemp=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if(pointer==i) {
                newTemp.add(data);
            }
            else newTemp.add(temp[i]);
        }
        String newStr="";
        for (String each : newTemp) {
            newStr+=each;
        }
        System.out.println(newStr);
    }
}


