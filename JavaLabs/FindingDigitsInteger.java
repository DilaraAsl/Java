package JavaLabs;

public class FindingDigitsInteger {
    public static void main(String[] args) {
        int number=9873451;
        int length=String.valueOf(number).length();
        System.out.println(length);
        double[] digits=new double[length];
        int sum=0;
        for (int i=0;i<length;i++){
            digits[i]=((number%Math.pow(10,i+1))/(Math.pow(10,i)));
            System.out.println(digits[i]);
            sum+=(int)digits[i];

        }
        System.out.println(sum);
    }
}
