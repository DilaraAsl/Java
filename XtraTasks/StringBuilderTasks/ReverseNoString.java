package XtraTasks.StringBuilderTasks;

public class ReverseNoString {
    public static void main(String[] args) {
        String word = "ab251df98alm4563456245nhhgvugv123";
        String newStr = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            if (Character.isLetter(word.charAt(i)))
                newStr += word.charAt(i);
            else {
                sb.append(word.charAt(i));
                continue;
            }
            newStr += sb.reverse();
            sb.setLength(0);

        }
        System.out.println(newStr);
    }
}
