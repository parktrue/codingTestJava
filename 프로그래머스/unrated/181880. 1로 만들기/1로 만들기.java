class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            int count = 0;
            if (num_list[i] > 1) {
                while (num_list[i] != 1) {
                    if ((num_list[i] & 1) == 0) {
                        num_list[i] /= 2;
                    } else {
                        num_list[i] = (num_list[i] - 1) / 2;
                    }
                count++;
                }
            sum += count;
            }
        }
        answer = sum;
        return answer;
    }
}