class Solution {
    public int solution(int[] numbers, int n) {
        int len = numbers.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
            if (sum > n) {
                break;
            }
        }
        return sum;
    }
}