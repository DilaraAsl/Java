package Day17_CustomClasses;

public class ItemAttributesTester {
    public static void main(String[] args) {
        ItemAttributes item1=new ItemAttributes("Calculator",45, 3);
        System.out.println(item1.toString());
        System.out.println("Total cost: "+item1.calcCost());
    }
}
