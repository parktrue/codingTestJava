class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 0; i <= n; i++) {
            if (i * i == n) {
                return ++i * i;
            } else if (i == n) {
                return -1;
            }
        }
        return answer;
    }
}