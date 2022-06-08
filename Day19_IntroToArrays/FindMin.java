package Day19_IntroToArrays;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] numbers={100,25,40,-15,30};
        int min=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println(min);
        System.out.println("index of "+min+" is "+findIndex(numbers,min));
        System.out.println("array of numbers : " + Arrays.toString(numbers));


    }

    public static int findIndex(int[] numbers,int min){
        for (int i = 0; i < numbers.length; i++) {
            if(min==numbers[i]) return i;
        }
        return -1;
    }
}
