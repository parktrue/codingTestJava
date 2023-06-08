class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int minus = 0;
        if (n >= 10) {
            minus = (int) n / (int) 10;
        }
        answer = (n * 12000) + (2000 * k) - (2000 * minus);
        return answer;
    }
}