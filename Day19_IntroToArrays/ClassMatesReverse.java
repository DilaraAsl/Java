package Day19_IntroToArrays;

public class ClassMatesReverse {
    public static void main(String[] args) {
        String[] names=new String[]{"java girl","mava man","kava cat","lava lamp"};
        for (int i = 0; i < names.length; i++) {
            for (int j=names[i].length()-1;j>=0 ; j--) { // name length-1 is the index for the last character in name
                System.out.print(""+names[i].charAt(j));

            }
            System.out.println();
        }



    }
}
