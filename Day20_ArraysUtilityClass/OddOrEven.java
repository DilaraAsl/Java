package Day20_ArraysUtilityClass;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers={2,5,4,33,75,86,11,52,34,45,31,41,33};
        int counter=0;
        for (int each : numbers) {
            if(each%2==0) counter++;

        }
        int oddNo=numbers.length-counter;
        System.out.println("Odd numbers:  "+oddNo);
        System.out.println("Even numbers: "+counter);
    }
}
