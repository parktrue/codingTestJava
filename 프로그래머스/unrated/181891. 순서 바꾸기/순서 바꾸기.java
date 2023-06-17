class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        
        int[] tempNum1 = new int[n];
        for (int i = 0; i < n; i++) {
            tempNum1[i] = num_list[i];
        }
        
        int[] tempNum2 = new int[len - n];
        for (int i = n, j = 0; i < len; i++, j++) {
            tempNum2[j] = num_list[i];
        }
        
        int[] answer = new int[len];
        for (int i = 0; i < len - n; i++) {
            answer[i] = tempNum2[i];
        }
        
        for (int i = len - n, j = 0; i < len; i++, j++) {
            answer[i] = tempNum1[j];
        }
        return answer;
    }
}