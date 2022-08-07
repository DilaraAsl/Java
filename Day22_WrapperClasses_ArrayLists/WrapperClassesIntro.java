package Day22_WrapperClasses_ArrayLists;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        String str="Jack";
        Integer a=10;
        System.out.println("-----------------------------------");

        int b1=100; // can only be converted to its Wrapper class object
        Integer b2=b1; // assign primitive to wrapper class Autoboxing

        double c1=b1;
        long c2=b1; // OK implicitly casted


       // Double b2=b1; // will give an error
        Integer b4=b1; // ONLY USE ITS OWN WRAPPER CLASS do not use casting

        char ch='A';
        Character ch2=ch;

        //UNBOXING
        Integer number=20;
        int no=number; // unboxed - converted to primitive data type int
        long longNo=number; // unboxing works as long as they are bigger than int variable
        // WHEN UNBOXING USE ITS OWN PRIMITIVE TYPE - GOOD PROGRAMMING
        Character a1='2';
        char c4=a1;
        int nChar=a1; // no longer a character it is a number
    }
}
