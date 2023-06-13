class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        
        int multiple = 1;
        int sum = 0;
        
        if (len >= 11) {
            for (int i = 0; i < len; i++) {
                sum += num_list[i];
            }
            return sum;
        } else {
            for (int i = 0; i < len; i++) {
                multiple *= num_list[i];
            }
            return multiple;
        }
    }
}