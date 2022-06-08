package Day18_GarbageCollection;

public class HighestFrequencyIndexSolution {
    public static void main(String[] args) {
        String str="alliswell";
        int max=1;
        char freq='\0';
        int difference=0;
        String temp="";
        for (int i = 0; i <str.length() ; i++) {


            temp=temp.replace(""+str.charAt(i),"");
            difference=str.length()-temp.length();
            if(difference>max){
                max=difference;
                freq=str.charAt(i);



            }


        }
       System.out.println(freq);
    }
}
