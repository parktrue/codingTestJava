class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len - n + 1];
        
        int j = 0;
        for (int i = n - 1; i < len; i++) {
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}