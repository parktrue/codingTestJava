class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int length = numbers.length;
        
        for (int i = 0; i < length; i++) {
            numbers[i] *= 2;
        }
        answer = numbers;
        return answer;
    }
}