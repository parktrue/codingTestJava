class Solution {
    public int[] solution(int[] array) {
        int len = array.length;
        int maxI = 0;
        
        for (int i = 0; i < len; i++) {
            if (array[i] > array[maxI]) {
                maxI = i;
            }
        }
        int[] answer = {array[maxI], maxI};
        return answer;
    }
}