package XtraTasks.leetCode;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] sArray = s.toCharArray();
        Stack<Character> p = new Stack<>();

        for (int i = 0; i < sArray.length; i++) {

            if (sArray[i] == '(' || sArray[i] == '{' || sArray[i] == '[') {
                p.push(sArray[i]);

            } else if (!(p.isEmpty()) && (((sArray[i] == ')') && (p.peek() == '(')) ||
                    ((sArray[i] == '}') && (p.peek() == '{')) ||
                    ((sArray[i] == ']') && (p.peek() == '[')))) {

                p.pop();

            } else return false;

        }
        if (p.isEmpty()) return true;
        return false;
    }
}
