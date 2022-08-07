package day27_AccessModifiers;

public class AccessModifiers {
    public static int publicData=200;
    protected static int protectedData=400;
    static int defaultData=100;
    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);// accessible
        System.out.println(defaultData);
    }
}
