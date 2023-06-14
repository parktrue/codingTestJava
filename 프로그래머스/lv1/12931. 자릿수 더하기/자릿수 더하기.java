import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        char[] nChar = Integer.toString(n).toCharArray();
        int len = nChar.length;
        
        for (int i = 0; i < len; i++) {
            sum += Character.getNumericValue(nChar[i]);
        }
        answer = sum;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}