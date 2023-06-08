class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;
        
        for (int i = 0; i < length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }
}