package XtraTasks.recursion;

// This program adds the digits of a number using recursion
// for example : 135 ==>9
//               12==>3
public class AddingDigits {
    public static void main(String[] args) {
        int n = 135;
        System.out.println(addDigits(n));
        ;
    }

    public static int addDigits(int n) {
        if (n == 0) return 0;
        int remainder = n % 10;
        int remainingNo = n / 10;

        return addDigits(remainingNo) + remainder;

    }
}
