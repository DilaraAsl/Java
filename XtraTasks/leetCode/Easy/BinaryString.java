package XtraTasks.leetCode.Easy;

public class BinaryString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "100";
        String str2 = "1";
        int carry = 0;
        int sum = 0;
        int i = str.length() - 1;
        int j = str2.length() - 1;
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {

                sum += str.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += str.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;


        }
        if (carry != 0) sb.append(carry);
        sb.reverse();

        System.out.println(sb.toString());

    }
}
