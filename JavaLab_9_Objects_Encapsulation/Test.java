package JavaLab_9_Objects_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Daniel", 28, 'M', "A01", "QA", 40);

        System.out.println(tester1);
        Developer developer1=new Developer("Lorraine",26,'F',"C23","Back end developer",50,"Java");
        developer1.coding();

    }


}
