package day27_AccessModifiers;

public class InstanceInitializationBlock {
    public String name;
    public int age;
    {
        name="James"; // default name for every object will be James
        age=20; // default age for every object will be 20
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1=new InstanceInitializationBlock();
        InstanceInitializationBlock obj2=new InstanceInitializationBlock();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
