package codes;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisBalancing {
    public static boolean isBalanced(char[] arr) {
        // Using stack available in collection framework
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                stack.push(arr[i]);
            } else {
                //If the stack is empty
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char bracket = stack.pop();
                    if (isMatching(bracket, arr[i])) {
                        continue;
                    } else {
                        return false;
                    }

                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char bracket1, char bracket2) {
        return ((bracket1 == '(' && bracket2 == ')') || (bracket1 == '{' && bracket2 == '}') ||
                (bracket1 == '[' && bracket2 == ']'));
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{{[]}}".toCharArray()));
        System.out.println(isBalanced("}{".toCharArray()));
    }

}
