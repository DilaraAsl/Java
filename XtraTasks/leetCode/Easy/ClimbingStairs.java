package XtraTasks.leetCode.Easy;

public class ClimbingStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        int sum = 0;
        if (n == 1) {
            sum = 1;
        }
        if (n == 2) {
            sum = 2;

        }
        if (n > 2) {
            sum = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return sum;
    }
}
