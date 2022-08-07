package XtraTasks.GaddisLoShu494;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<Integer>(9);
        for (int i = 1; i < 10; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        int[][] loShu = new int[3][3];
      int index=0;
        System.out.println(loShu.length);
        for (int i = 0; i <loShu.length; i++) {
            for (int j = 0; j <loShu.length; j++) {
                loShu[i][j]=numbers.get(index);
                index++;
            }
        }
        System.out.println(Arrays.deepToString(loShu));

       System.out.println(isMagicSquare(loShu));
    }
public static boolean isMagicSquare(int[][] list){
        // check columns

    for (int i = 0; i < list.length; i++) {
        int sum=0;
        for (int j = 0; j < list.length; j++) {
            sum+=list[i][j];
        }
        if (sum==15) return true;


    }
    //check the columns
    for (int i = 0; i < list.length; i++) {
        int sum=0;
        for (int j = 0; j < list.length; j++) {
            sum+=list[j][i];
        }
        if (sum==15) return true;


    }
    for (int i = 0; i < list.length; i++) {
        int sum = 0;
        sum += list[i][i];

        if (sum == 15) return true;
    }
    return false;
    }
}
