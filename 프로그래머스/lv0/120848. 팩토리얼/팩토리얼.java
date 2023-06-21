class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial == n) {
                return i;
            } else if (factorial > n) {
                return i - 1;
            }
        }
        return answer;
    }
}