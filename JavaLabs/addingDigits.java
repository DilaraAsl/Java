package JavaLabs;

public class addingDigits {

    public static void main(String[] args) {

            int number = 29814; // 2 + 9 + 8 + 1 + 4 = 24
            int digit1=number%10; //4 is the remainder
            int rdigits1=number-digit1; //29814-4 is 29810
            rdigits1/=10; //29810 divided by 10 is 2981
            int digit2=rdigits1%10; // 2981 %10 is 1
            int rdigits2=rdigits1-digit2; // 2981-1 is 2980
            rdigits2/=10; //2980 divided by 10 is 298
            int digit3=rdigits2%10;// 298%10 is 8
            int rdigits3=rdigits2-digit3; // 298-8 is 290
            rdigits3/=10;// 290 divided by 10 is 29
            int digit4=rdigits3%10;// 29 %10 is 9
            int rdigits4=rdigits3-digit4; // 29 minus 9 is 20
            rdigits4/=10; // 20 divided by 10 is 2
        int digit5=rdigits4;// remaining digit is 2

       int sumDigits=digit1+digit2+digit3+digit4+digit5;

            int result = 24;

            System.out.println("Sum of digits is :"+sumDigits);
            System.out.println("Result is: " + result);
    }
}

