class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] even = new int[n];
        
        for (int i = 0; i < n; i++) {
            even[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            if (even[i] % 2 == 0) {
                answer += even[i];
            }
        }
        return answer;
    }
}