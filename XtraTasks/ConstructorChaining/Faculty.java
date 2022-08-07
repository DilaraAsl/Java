package XtraTasks.ConstructorChaining;
public class Faculty extends Employee{
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty(){
        System.out.println("4 Invoke Faculty's non argument constructor");
    }
}
