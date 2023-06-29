import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int body = (int) (len / n);
        int tail = len % n;
        
        String[] answer;
        if (tail != 0) {
            answer = new String[body + 1];
        } else {
            answer = new String[body];
        }
        
        for (int i = 0; i < body; i++) {
            answer[i] = my_str.substring(i * n, (i + 1) * n);
        }
        
        if (tail != 0) {
            answer[body] = my_str.substring(body * n);
        }
        
        return answer;
    }
}