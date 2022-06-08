package Day18_GarbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println("Your available balance is "+balance);
    }
    public void deposit(double depositAmount){
        if(depositAmount<1){
            System.err.println("Insufficient amount "+ depositAmount);
        return;} // takes out of the method
        balance+=depositAmount;

    }
    public void withdraw(double withdrawAmount){
        if(balance<withdrawAmount){
            System.err.println("Insufficient resources ");
            return;
        }
        balance-=withdrawAmount;

    }
}
