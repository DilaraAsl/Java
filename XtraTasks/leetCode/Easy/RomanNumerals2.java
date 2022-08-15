package XtraTasks.leetCode.Easy;

class RomanNumerals2 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (i + 1 < s.length() - 1 && getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                sum += getValue(s.charAt(i + 1)) - getValue(s.charAt(i));
                i++; // skip the next iteration

            } else sum += getValue(s.charAt(i));

        }
        if (getValue(s.charAt(s.length() - 2)) < getValue(s.charAt(s.length() - 1))) {
            sum += getValue(s.charAt(s.length() - 1)) - getValue(s.charAt(s.length() - 2)) - getValue(s.charAt(s.length() - 2));


        } else
            sum += getValue(s.charAt(s.length() - 1));
        return sum;
    }


    public static int getValue(char c) {
        int val = 0;
        switch (c) {
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;

        }
        return val;
    }
}