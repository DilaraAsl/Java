package XtraTasks.recursion;

public class ChangeXtoY {
    public static void main(String[] args) {
        String str = "xhixx";
        System.out.println(changeXY(str));
    }

    public static String changeXY(String str) {
        if (str.length() < 1) return str;
        if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
    }
}
