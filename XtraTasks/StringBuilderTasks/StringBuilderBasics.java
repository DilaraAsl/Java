package XtraTasks.StringBuilderTasks;

public class StringBuilderBasics {
    public static void main(String[] args) {
        String str = "duck";
        buildAString(str);
    }

    public static void buildAString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("123");
        System.out.println(sb.toString());
        sb.delete(0, 4);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.deleteCharAt(1);
        System.out.println(sb.toString());
        sb.replace(0, 1, "5");
        System.out.println(sb.toString());
    }
}
