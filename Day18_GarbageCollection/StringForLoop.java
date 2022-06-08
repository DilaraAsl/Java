package Day18_GarbageCollection;

public class StringForLoop {
    public static void main(String[] args) {
        String str="Java lama";
        System.out.println(str.length());
        for (int i = 0; i <str.length()-3 ; i++) {
            System.out.println(str.substring(i,i+3));


        }


    }
}
