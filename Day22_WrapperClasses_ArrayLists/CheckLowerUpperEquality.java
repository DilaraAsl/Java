package Day22_WrapperClasses_ArrayLists;

public class CheckLowerUpperEquality {
    public static void main(String[] args) {
        String str="JAVA java";
        int upper=0;
        int lower=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
            if(Character.isUpperCase(str.charAt(i))){
                upper++;
            }

        }
        if(upper==lower){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
