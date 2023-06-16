class Solution {
    public long solution(int a, int b) {
        
        long sum = 0;
        if (a == b) {
            return a;
        } else if (a < b) {
            for (long i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        } else {
            for (long i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    }
}