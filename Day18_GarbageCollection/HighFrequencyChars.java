package Day18_GarbageCollection;

import java.util.Scanner;

public class HighFrequencyChars {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=kb.next();
        String frequentChars="";
        int max=0;
        for (int i = 0; i <str.length() ; i++) { //outer loop
            int counter=0;
            for (int j = 0; j <str.length() ; j++) { //inner loop goes through the whole word one by one and compares it to the outer loop char
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }

            }
            if(counter>max){
                max=counter;
                frequentChars=""+str.charAt(i); // temp hold the max character until the condition changes
            }
            if(counter==max&&!(frequentChars.equals(""+str.charAt(i)))){
                frequentChars+=""+str.charAt(i);
            }


        }
        System.out.println(frequentChars);
    }
}
