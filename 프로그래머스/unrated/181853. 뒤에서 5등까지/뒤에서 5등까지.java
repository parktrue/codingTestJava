class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int len = num_list.length;
        int temp = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (num_list[j] > num_list[j + 1]) {
                    temp = num_list[j];
                    num_list[j] = num_list[j + 1];
                    num_list[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}