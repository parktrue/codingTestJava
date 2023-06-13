class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len - 5];
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
        
        int k = 0;
        for (int i = 5; i < len; i++) {
            answer[k] = num_list[i];
            k++;
        }
        return answer;
    }
}