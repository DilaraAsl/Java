package Day19_IntroToArrays;

public class ArraySearch {
    public static void main(String[] args) {
        String[] item = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 Case"};
        double[] price = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemID = {12345, 123456, 123457, 123458, 123459, 123460};
        // find out the index no of Gloves
        // find out if "ipad" is in the item list
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals("Gloves")) System.out.println("Index no of gloves is :" + i);
            if (item[i].contains("iPad")) System.out.println("There is an iPad in the item list");
        }

        for (int i = 0; i < item.length; i++) {

            System.out.println("Item name :" + item[i] + "-- price :" + price[i] + "-- itemID :" + itemID[i]);
        }


        // print the report of each shopping item name price ID
    }
}
