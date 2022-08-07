package Day22_WrapperClasses_ArrayLists;

public class CharacterWrapperMethods {
    public static void main(String[] args) {
        char ch='A'; char ch1='@';

            boolean isLetter= Character.isLetter(ch);
            boolean isLowerCase=Character.isLowerCase(ch);
            boolean isUpperCase=Character.isUpperCase(ch);
            boolean isSpecialCharacter=!Character.isLetterOrDigit(ch1);

        System.out.println(isLetter);
        System.out.println(isLowerCase);
        System.out.println(isUpperCase);
        System.out.println(isSpecialCharacter);

        String str="a1b2c3d4a5";
        int sum=0;
        char[] temp=str.toCharArray();
        for (char each : temp) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);
    }
}
