class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        int temp = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Array.sort 사용가능
        int max1 = numbers[len - 1] * numbers[len - 2];
        int max2 = numbers[0] * numbers[1];
        answer = Math.max(max1, max2);
        return answer;
    }
}