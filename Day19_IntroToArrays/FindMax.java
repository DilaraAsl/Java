package Day19_IntroToArrays;

public class FindMax {
    public static void main(String[] args) {
        int[] numbers=new int[]{3,16,88,45,24};
        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) { // start comparing from the second element

            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println(max);
    }
}
