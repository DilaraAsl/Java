package Day22_WrapperClasses_ArrayLists;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="20";
        int no=Integer.parseInt(str); // parseInt returns int no autoboxing or unboxing
        Integer no1=Integer.parseInt(str); // autoboxing Wrapper assigned to primitive
        System.out.println(no);
        //
        Double d1=Double.valueOf(str);
        double d2=Double.valueOf(str);// unboxing Double wrapper type assigned to primitive
        System.out.println(d1);
        System.out.println(d2);
    }
}
