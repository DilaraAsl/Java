package JavaLab_05_Strings;

public class reverse {
    public static void main(String[] args) {
        String str="Javamavakava";
        String reverse="";
        for (int i =str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);

        }
        System.out.println(reverse);
        boolean isIT=reverse.equals(str);

        reverse=reverse.repeat(3); // repeats the string repeated no of times
        System.out.println(reverse);
        System.out.println(reverse.startsWith("ava"));
    }
}
