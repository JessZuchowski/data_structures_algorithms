package challenges.multiBracketValidation;

import java.util.Stack;

//reference: https://stackoverflow.com/questions/23187539/java-balanced-expressions-check
public class MultiBracketValidation {
    public static boolean multiBracketValidation (String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char bracket = string.charAt(i);
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (bracket == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (bracket == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return true;
    }
}
