package XtraTasks.ConstructorChaining;

public class Employee extends Person{
    public Employee(){
        this(" 2 Invoke employee's overloaded constructor");
        System.out.println("3 Invoke employee's no arg constructor");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
