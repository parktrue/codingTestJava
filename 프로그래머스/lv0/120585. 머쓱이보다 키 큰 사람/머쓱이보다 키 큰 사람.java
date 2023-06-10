class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int count = 0;
        int len = array.length;
        
        for (int i = 0; i < len; i++) {
            if (array[i] > height) {
                count++;
            }
        }
        answer = count;
        return answer;
    }
}