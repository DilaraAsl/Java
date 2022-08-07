package Day26_Statics;

public class ConstructorCalls2 {
    public ConstructorCalls2() {
        this("java");
        System.out.println("Default constructor ");
    }
    public ConstructorCalls2(int a) {
        this();
        System.out.println("Constructor which accepts integer argument");
    }
    public ConstructorCalls2(String str) {

        System.out.println("Constructor which accepts string argument ");
    }
}
