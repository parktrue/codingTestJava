class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int totalColas = 0;
        
        while (n >= a) {
            int exchangedColas = n / a;
            totalColas += exchangedColas * b;
            n = exchangedColas * b + (n % a);
        }

        return answer + totalColas;
    }
}
