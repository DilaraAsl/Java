package Day17_CustomClasses;

public class FindUniqueElement {
    public static void main(String[] args) {
        String str="aabccd";
        String unique;
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }

        }
    }



}
