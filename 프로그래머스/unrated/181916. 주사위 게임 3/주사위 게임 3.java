import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        
        if (a == b && b == c && c == d) {
            answer = 1111 * arr[0];
            
        } else if (a != b && a != c && a != d && b != c && b != d && c != d) {
            answer = arr[0];
            
        } else if (arr[0] == arr[1] && arr[2] == arr[3] && arr[1] != arr[2]) {
            answer = (arr[0] + arr[2]) * (arr[3] - arr[1]);
            
        } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            answer = (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
        } else if (arr[1] == arr[2] && arr[2] == arr[3]) {
            answer = (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]);

        } else if (arr[0] == arr[1] && arr[2] != arr[3]) {
            answer = arr[2] * arr[3];
        } else if (arr[1] == arr[2] && arr[0] != arr[3]) {
            answer = arr[0] * arr[3];
        } else if (arr[2] == arr[3] && arr[0] != arr[1]) {
            answer = arr[0] * arr[1];
        }
        return answer;
    }
}