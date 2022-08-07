package XtraTasks.leetCode.Easy;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String parentheses = "{}[(}]";
        System.out.println((isValid(parentheses)));
    }

    public static boolean isValid(String str) {
        if (str.isEmpty()) return false;
        if (str.length() % 2 != 0) return false; // we need matching pairs to close the parentheses
        Stack<Character> stack = new Stack<>();
        for (char each : str.toCharArray()) {
            if (each == '(' || each == '{' || each == '[') stack.push(each);
            else if ((each == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                stack.pop();
            }
            //    (each == ')' && !stack.isEmpty() && stack.peek() == '(') ||
            //   (each == '}' && !stack.isEmpty() && stack.peek() == '{')) {
            else if (each == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (each == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }


        return stack.isEmpty();
    }
}