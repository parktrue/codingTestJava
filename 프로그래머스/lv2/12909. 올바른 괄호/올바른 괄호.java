import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        Stack<Character> stack = new Stack<>();
        char[] sChar = s.toCharArray();
        int len = sChar.length;

        for (int i = 0; i < len; i++) {
            if (sChar[i] == '(') {
                stack.push(sChar[i]);
            } else if (sChar[i] == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}