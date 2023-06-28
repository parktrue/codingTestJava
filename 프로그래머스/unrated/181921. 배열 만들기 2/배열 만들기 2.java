import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        
        for (int i = l; i <= r; i++) {
            String numStr = Integer.toString(i);
            if (numStr.chars().allMatch(c -> c == '0' || c == '5')) {
                count++;
            }
        }
        
        if (count == 0) {
            return new int[] {-1};
        }
        
        int[] answer = new int[count];
        for (int i = l, j = 0; i <= r; i++) {
            String numStr = Integer.toString(i);
            if (numStr.chars().allMatch(c -> c == '0' || c == '5')) {
                answer[j] = Integer.parseInt(numStr);
                j++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}