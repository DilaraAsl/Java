public class test {
    public static void main(String[] args) {
        String str = "welcometojava";
        for (int i = 0; i < str.length() - 2; i++) {
            System.out.println(str.substring(i, i + 3));
        }


        String str2 = "Hello World!!!";
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

    }
}
