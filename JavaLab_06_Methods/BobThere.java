package JavaLab_06_Methods;

public class BobThere {
    public static void main(String[] args) {
        String str="abXYabc";
        int n=3;
        String each=str.substring(0,n);
        str=str.replaceFirst("each","");
        System.out.println(str);
        if(str.contains(each)) System.out.println(true);
        System.out.println(false);
    }
}