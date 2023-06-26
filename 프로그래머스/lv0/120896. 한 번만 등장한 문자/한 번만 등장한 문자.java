import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] sChar = s.toCharArray();
        int len = sChar.length;
        int[] checkIndex = new int[len];
        int check = 0;
        
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (sChar[i] == sChar[j]) {
                    count++;
                }
            }
            if (count == 1) {
                checkIndex[check++] = i;
            }
        }
        
        char[] result = new char[check];
        for (int i = 0, j = 0; i < check; i++) {
            if (checkIndex[i] < len) {
                result[j] = sChar[checkIndex[i]];
                j++;
            }
        }
        
        Arrays.sort(result);
        String answer = new String(result);
        return answer;
    }
}