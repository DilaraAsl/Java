package Day18_GarbageCollection;

import java.util.Scanner;

public class ReturnIndexUniqueChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a string");
        String str=kb.next();
        System.out.println(findUniqueChar(str));

    }
    public static int  findUniqueChar(String str){

        for (int i = 0; i <str.length() ; i++) {
            int counter=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }

            }
            if (counter==1) return i;

        }
        return -1;
    }

}
