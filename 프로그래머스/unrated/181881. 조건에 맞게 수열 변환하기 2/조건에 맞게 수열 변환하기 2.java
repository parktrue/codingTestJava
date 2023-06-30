import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int len = arr.length;
        int[] tempArr = arr.clone();
        
        while (true) {
            for (int i = 0; i < len; i++) {
                if (arr[i] >= 50 && (arr[i] & 1) == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && (arr[i] & 1) == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(tempArr, arr)) {
                break;
            }
            tempArr = arr.clone();
            x++;
        }
        return x;
    }
}