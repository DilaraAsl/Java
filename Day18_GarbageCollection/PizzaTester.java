package Day18_GarbageCollection;

public class PizzaTester {
    public static void main(String[] args) {
    Pizza pizza1=new Pizza('m',2,1);

    pizza1.toString();


    Pizza pizza2=new Pizza('l',3,2);
        System.out.println(pizza1.toString()); // gray means no need in IntelliJ
    System.out.println(pizza2.toString());
        System.out.println(pizza1);
        System.out.println("-----------------------------------------");
       double totalCost=0;
        for (int i = 0; i <20 ; i++) {
            Pizza small=new Pizza('s',2,2);
            totalCost+=small.calcCostOf();
            Pizza medium=new Pizza('m',3,4);
            totalCost+=medium.calcCostOf();
            Pizza large=new Pizza('l',4,5);
            totalCost+=large.calcCostOf();

        }
        System.out.println("total cost "+totalCost);
    }
}
