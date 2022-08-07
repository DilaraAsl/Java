package XtraTasks.leetCode.Easy;

public class NumberPalindrome {
    public static void main(String[] args) {

        int x = 121;
        // x should be >0 and should not end with 0.
        if (x < 0 || (x % 10 == 0 && x > 0)) {
            System.err.println("Your number cannot be a palindrome");
        }
        int reversedNo = 0;

        while (x > reversedNo) {

            reversedNo = reversedNo * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(reversedNo);
        if (reversedNo == x) {
            System.out.println(" Your number is  a palindrome");
        } else System.err.println("Your number is not a palindrome ");
    }
}
