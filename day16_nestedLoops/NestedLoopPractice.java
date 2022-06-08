package day16_nestedLoops;

public class NestedLoopPractice {
    public static void main(String[] args) {
        String str="aabbbcccddeeefff";
        String result="";

        char ch=str.charAt(0);
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)==str.charAt(i)){count++;}



            }


        }

    }
}
