import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int len = array.length;
        Arrays.sort(array);
        
        if (array[0] >= n) {
            answer = array[0];
        } else if (array[len - 1] <= n) {
            answer = array[len - 1];
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (array[i] <= n && array[i + 1] >= n) {
                    if (n - array[i] <= array[i + 1] - n) {
                        answer = array[i];
                    } else {
                        answer = array[i + 1];
                    }
                    break;
                }
            }
        }

        return answer;
    }
}