import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false
     */

    public static void main(String[] args) {
        String s = "([{])";

        System.out.println(checkValid(s));
    }

    static boolean checkValid(String s) {
        String open = "({[";
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(open.indexOf(c) != -1) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                else {
                    char tmp = stack.pop();

                    if(getChar(tmp) != c){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }

    static char getChar(char c) {
        switch (c) {
            case '(':return ')';
            case '{':return '}';
            case '[':return ']';
            default:return ' ';
        }
    }
}
