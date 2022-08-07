package GroupExercises;

public class ReverseNumbersInString {
    public static void main(String[] args) {
        String word = "ab251df98alm4563456245nhhgvugv123";
        String strChar = "";
        int count = 0;

        char[] ch = word.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (Character.isDigit(ch[i]) && Character.isDigit(strChar.charAt(strChar.length() - 1))) {
                count++;
                strChar = strChar.substring(0, strChar.length() - count) + ch[i] + strChar.substring(strChar.length() - (count));
            } else {
                strChar += ch[i];
                count = 0;
            }
        }
        System.out.println(strChar);

    }
}