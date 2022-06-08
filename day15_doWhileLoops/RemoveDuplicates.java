package day15_doWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aaabbbcccc";
        String newWord="";
       // String newWord=str.replace("a","");
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!newWord.contains(""+each))//check if newWord has the character or not
            {
                newWord+=""+each;

            }

        }
        System.out.println(newWord);
    }
}
