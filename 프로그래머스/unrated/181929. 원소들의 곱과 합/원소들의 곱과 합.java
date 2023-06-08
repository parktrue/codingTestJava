class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int length = num_list.length;
        int product = 1;
        int square = 0;
        int sum = 0;
        
        for (int i = 0; i < length; i++) {
            product *= num_list[i];
        }
        for (int i = 0; i < length; i++) {
            sum += num_list[i];
        }
        square = sum * sum;
        if (product > square) {
            answer = 0;
        } else if (product < square) {
            answer = 1;
        }
        
        return answer;
    }
}