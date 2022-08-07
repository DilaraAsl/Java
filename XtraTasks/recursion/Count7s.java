package XtraTasks.recursion;

public class Count7s {
    //Given a non-negative int n, return the count of the occurrences of 7 as a digit,
    // so for example 717 yields 2. (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    public static void main(String[] args) {

        int n = 717;

        System.out.println(count7s(n));
    }

    public static int count7s(int n) {

        if (n == 0) return 0;

        int remainder = n % 10;
        if (remainder == 7)
            return 1 + count7s(n / 10);

        return count7s(n / 10);


    }

}
