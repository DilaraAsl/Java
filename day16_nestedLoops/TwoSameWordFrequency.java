package day16_nestedLoops;

public class TwoSameWordFrequency {
    public static void main(String[] args) {
        String str="caT dog DoG caT dog dog cat cat";
        String find1="cat";
        String find2="dog";
        System.out.println("Same frequency of both words: "+sameWord(str,find1,find2));
    }

    public static boolean sameWord(String str, String find1, String find2) {
      str=str.toLowerCase();
        int sum1=0; int sum2=0;
        for (int i = 0; i+3<= (str.length()); i++) {

            if(find1.equals(str.substring(i,i+3))) sum1++;
            if (find2.equals(str.substring(i,i+3))) sum2++;

        }
        if (sum1==sum2)return true;
        return false;
    }

}
