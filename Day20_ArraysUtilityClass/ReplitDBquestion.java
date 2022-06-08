package Day20_ArraysUtilityClass;

import java.util.*;

public class ReplitDBquestion {
    public static void main(String[] args) {
        String newString = "";
        String op = "add";
        String id = "4";
        String db = "1etsy#2wooden#3spoon";
        String data = "BBB";
        String[] temp = db.split("#");
        // add operator
        if(op.equals("add") && db.contains(id)){
        for (int i = 0; i < temp.length; i++) {

            if (id.equals("" + temp[i].charAt(0))) {
                temp[i] = id + data;
            }
            newString+=temp[i];}}
            // if id is out of range
            if(op.equals("add") && !db.contains(id)){
                newString=db+"#"+id+data;
            }
            // delete
            if(op.equals("delete") && db.contains(id)){

                for (int j = 0; j < temp.length; j++) {
                    if (id.equals("" + temp[j].charAt(0))) {
                        temp[j]=temp[j].replace(temp[j],"");
                    }
                    newString+="#"+temp[j];
                }
            }
        System.out.println(newString);
        }



    }







