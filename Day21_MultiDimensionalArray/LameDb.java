package Day21_MultiDimensionalArray;

import java.util.Arrays;

public class LameDb {
    public static void main(String[] args) {
        String data = "BBB";
        String id = "4";
        String op = "add";
        String db = "1etsy#2wooden#3spoon";
        // 1etsy 2wooden 3spoon
        String[] temp = db.split("#");
String part1="";
String part2="";
        int index=Integer.parseInt(id);

        // etsy wooden spoon stored in the array
        for (int i = 0; i < temp.length; i++) {
            temp[i]=temp[i].substring(1);
        }
        String tempstr="";
        if(index==1){
            for (String s : temp) {
                index++;
                tempstr+=index+s+"#";
            }
            System.out.println("1"+data+tempstr);
        }
        if(index>3){
            System.out.println(db+"#4"+data);
        }
        if(index> 1&& index<4){
        for (int i = 0; i <= index-2; i++) {
            part1+=(i+1)+temp[i]+"#";
        }
        //System.out.println(part1);
        for(int j=index-1;j<temp.length;j++){
            part2+="#"+(j+2)+temp[j];
            //System.out.println(part2);
        }
      System.out.println(part1+(index)+data+part2);
        }
    }
}
