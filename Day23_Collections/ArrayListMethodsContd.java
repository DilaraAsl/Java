package Day23_Collections;

import java.util.ArrayList;

public class ArrayListMethodsContd {
    public static void main(String[] args) {
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("paper towel");
        groceryList.add("apples");
        groceryList.add("vegetable oil");
        groceryList.set(1,"spinach");
        groceryList.add(1,"yogurt");
        System.out.println(groceryList);
        groceryList.remove("apples");
        groceryList.remove(0);
        System.out.println(groceryList);
    }
}
