import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortArr = emergency.clone();
        Arrays.sort(sortArr);
        int len = emergency.length;
        int [] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (emergency[i] == sortArr[j]) {
                    answer[i] = len - j;
                }
            }
        }
        
        return answer;
    }
}