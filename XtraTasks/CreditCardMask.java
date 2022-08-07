package XtraTasks;

public class CreditCardMask {
    public static void main(String[] args) {
        String str = "3452222333";
        System.out.println(maskify(str));
    }

    public static String maskify(String str) {
        if (str.isEmpty() || str.isBlank()) return "";
        if (str.length() <= 4) return str;
        String newStr = "";
        char[] list = str.toCharArray();
        for (int i = list.length - 5; i >= 0; i--) {
            list[i] = '#';

        }
        for (int i = 0; i < list.length; i++) {
            newStr += list[i];
        }
        return newStr;
    }
}
