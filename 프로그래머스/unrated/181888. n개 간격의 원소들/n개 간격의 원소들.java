class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int count = 0;
        
        for (int i = 0; i < len; i+= n) {
            count++;
        }

        int[] answer = new int[count];
        
        int k = 0;        
        for (int i = 0; i < len; i += n) {
            answer[k] = num_list[i];
            k++;
        }
        return answer;
    }
}