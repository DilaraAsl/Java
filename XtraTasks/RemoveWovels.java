package XtraTasks;

public class RemoveWovels {
    public static void main(String[] args) {
        String str = "aedkcn";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'U' || str.charAt(i) == 'u') {
                str.replace("" + str.charAt(i), "");
            } else {
                newStr += str.charAt(i);
            }

        }
        System.out.println(newStr);

    }
}
