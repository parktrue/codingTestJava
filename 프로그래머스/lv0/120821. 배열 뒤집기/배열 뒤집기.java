class Solution {
    public int[] solution(int[] num_list) {
        int lengthCheck = num_list.length;
        int length = lengthCheck;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[lengthCheck - 1];
            lengthCheck--;
        }
        return answer;
    }
}