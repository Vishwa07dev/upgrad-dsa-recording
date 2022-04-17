package codes.dsa;

import java.util.Stack;

public class ParenthesisBalancing {

    /**
     * Verify if the given expression of parenthesis
     * is balanced ?
     */

    public static void main(String[] args) {
        System.out.println(isBalanced("{{[]}}"));  // true
        System.out.println(isBalanced("}{")); // false
    }

    public static boolean isBalanced(String s) {
         return isBalanced(s.toCharArray());
    }

    private static boolean isBalanced(char[] brackets) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<brackets.length;i++){

            if(brackets[i] == '(' || brackets[i] == '{' ||
                    brackets[i] == '['){
                stack.push(brackets[i]);
            }else{
                if(stack.isEmpty()){
                    return false ;
                }
                char bracket = stack.pop() ;
                if(isMatching(bracket, brackets[i])){
                    continue;
                }else{
                    return false ;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char bracket1, char bracket2) {

        return ( (bracket1 == '('&& bracket2==')')
                ||(bracket1 == '{'&& bracket2=='}')
                || (bracket1 == '['&& bracket2==']'));
    }

}
