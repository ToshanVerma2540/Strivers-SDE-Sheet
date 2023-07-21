import java.util.Stack;
public class Solution {public static boolean isValidParenthesis(String expression) {
    Stack<Character> stack = new Stack<>();
    int i = 0;
    while (i < expression.length()) {
        char currentChar = expression.charAt(i);
        if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
            stack.push(currentChar);
        } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), currentChar)) {
            stack.pop();
        } else {
            return false;
        }
        i++;
    }
    return stack.isEmpty();
}

private static boolean isMatchingPair(char opening, char closing) {
    return (opening == '(' && closing == ')') ||
            (opening == '[' && closing == ']') ||
            (opening == '{' && closing == '}');
}

}