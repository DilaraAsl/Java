package JavaLab_06_Methods;

import utilities.StringUtility;

public class CustomMethodsPractice4 {
    public static void main(String[] args) {
        String str="abbbccddd";
        String uniqueStr="";
        System.out.println(StringUtility.frequency(str,'a'));
        System.out.println("-------------------------------------");
        // find the frequency of every character
        for (int i = 0; i <str.length() ; i++) {
            if(StringUtility.frequency(str,str.charAt(i))==1){
                uniqueStr+=str.charAt(i);
            }

        }
        System.out.println(uniqueStr);
        System.out.println("-----------------------------------------------------------");
        String s="aaabbc";
        String nonDup=StringUtility.removeDup(s); //abc
        String result="";
        for(int i=0; i<nonDup.length();i++){
            result=""+nonDup.charAt(i)+StringUtility.frequency(s,nonDup.charAt(i));
        }
        System.out.println(result);
        }
    }

