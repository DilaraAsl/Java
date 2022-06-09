package Day20_ArraysUtilityClass;

import utilities.ArrayUtility;

public class UniqueElement {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 5, 6, 6, 6};
        for (int each : numbers) {
            int counter = 0;
            for (int i : numbers) {
                if (i == each) counter++;
            }
            if (counter == 1) System.out.print(each + " ");


        }
    }
}
