class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int count = 0; 

        for (int i = 0; i < k - 1; i++) {
            count = (count + 2) % len;
        }

        return numbers[count];
    }
}