package Day29_Inheritance.Tasks.EmployeeTask;

public class EmployeeTester {
    public static void main(String[] args) {
        Developer developer=new Developer("Ali",'M',35,"W23","Developer",120000,"Java");
        developer.coding();
        Tester tester=new Tester ("Muhtar",'M',33,"W235","Tester",100000);
        tester.testing();
        System.out.println(tester.toString());
        System.out.println(developer.toString());
    }
}
