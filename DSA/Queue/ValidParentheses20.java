import java.util.Stack;

public class ValidParentheses20 {

    class Solution {

        public boolean isValid(String s) {
            Stack<Character> ch = new Stack<>();
            for (Character cha : s.toCharArray()) {
                if (cha == '(' || cha == '[' || cha == '{') {
                    ch.push(cha);
                } else {
                    if (cha == ')') {
                        if (ch.isEmpty()) {
                            return false;
                        }
                        if (ch.peek() == '(') {
                            ch.pop();
                        } else {
                            return false;
                        }
                    }
                    if (cha == ']') {
                        if (ch.isEmpty()) {
                            return false;
                        }
                        if (ch.peek() == '[') {
                            ch.pop();
                        } else {
                            return false;
                        }
                    }
                    if (cha == '}') {
                        if (ch.isEmpty()) {
                            return false;
                        }
                        if (ch.peek() == '{') {
                            ch.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            return ch.isEmpty();
        }
    }

}
