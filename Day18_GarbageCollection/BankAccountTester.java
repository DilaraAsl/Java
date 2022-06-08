package Day18_GarbageCollection;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.setInfo("Sebastian",7895632L,100);
        account1.deposit(2000);
        System.out.println(account1);
        account1.deposit(-10);
        System.out.println(account1);
    }
}
