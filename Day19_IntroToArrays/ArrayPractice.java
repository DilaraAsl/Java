package Day19_IntroToArrays;
import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int [] numbers={8,99,15};
        System.out.println(numbers);


        System.out.println(Arrays.toString(numbers));
        numbers=new int[2];
        numbers[0]=101;
        numbers[1]=55;
      for(int each:numbers){
          System.out.println(each);
      }
      // prints the last item on the array
        System.out.println(numbers[numbers.length-1]);
    }
}
