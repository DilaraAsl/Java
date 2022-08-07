package Day25_ConstructorsAndDateFormatting;

public class Constructor_Intro {
    // this class has a default constructor which the compiler automatically defines/creates
    public Constructor_Intro(){
        System.out.println("Constructor_Intro object created!");
    }
    public Constructor_Intro(int a){
        System.out.println("Constructor object created by int argument constructor ");
    }
    public void add(){}
    public static void main(String[] args) {
       Constructor_Intro obj1= new Constructor_Intro(5);
        Constructor_Intro obj2= new Constructor_Intro(5);
    }
}
