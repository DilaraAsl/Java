package day16_nestedLoops;

import java.util.Scanner;

public class InterviewQ_stringNestedLoops {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a string ");
        String str=kb.next();
        String newStr="";

        for (int i = 0; i <str.length(); i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;

                }

            }
            if (count>1&& !newStr.contains(""+str.charAt(i))){
                newStr+=str.charAt(i);
                System.out.println(str.charAt(i)+" "+count);
            }

        }
        System.out.println(newStr);
    }
}
