package Day26_Statics;

public class ConstructorCalls {
    public ConstructorCalls() {
       // this(9);
        System.out.println("Default constructor");

    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with an integer argument");}
        // this();
    public static void main(String[] args) {
        ConstructorCalls c1=new ConstructorCalls(2);
        method1();
        method2();
    }
    public static  void method1(){
        System.out.println("Method 1");

    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
    }
}
