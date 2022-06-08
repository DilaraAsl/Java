package Day18_GarbageCollection;

import java.util.Scanner;

public class UniqueVowel {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(findFrequency(str));
    }
    public static int findFrequency(String str){

        for (int i = 0; i <str.length() ; i++) {
            int counter = 0;
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        counter++;
                    }
                }
            }
            if (counter==1)  return i;
        } return -1;
    }
}
