package GroupExercises;

public class ReverseNumbers {
    public static void main(String[] args) {
        String str = "34wd332dddkkl123dk4567kd";
        System.out.println(reverseNumbers(str));
    }

    public static String reverseNumbers(String str) {
        String numbers = "";
        String word = "";
        char[] strList = str.toCharArray();

        for (int i = 0; i < strList.length; i++) {
            if (Character.isLetter(strList[i])) {
                word += strList[i];
            } else if (i + 1 < strList.length) {

                if (Character.isDigit(strList[i]) && (Character.isDigit(strList[i + 1])) && i != strList.length - 1) {
                    numbers += strList[i];
                    continue;
                }
                numbers += strList[i];
                word += reverse(numbers);
                numbers = "";
            } else if (i == strList.length - 1 && Character.isDigit(strList[strList.length - 1])) {
                numbers += strList[strList.length - 1];
                word += reverse(numbers);
            }
        }


        return word;


    }

    public static String reverse(String numbers) {
        String reverseNO = "";
        for (int i = numbers.length() - 1; i >= 0; i--) {
            reverseNO += numbers.charAt(i);
        }
        return reverseNO;
    }
}
