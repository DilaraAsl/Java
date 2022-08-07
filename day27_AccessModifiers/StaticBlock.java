package day27_AccessModifiers;

public class StaticBlock {

 public StaticBlock(){
     System.out.println("constructor");
 }
    public static void main(String[] args) {
        System.out.println("Main method");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }
    // static block will be executed first before main
    static{
        System.out.println("static block");
    }
}
