class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 4; i <= n; i++) {
            int divisors = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisors++;
                    if(i / j != j) {
                        divisors++;
                    }
                }
            }
            if (divisors >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}