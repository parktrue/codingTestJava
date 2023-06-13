class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int sumOdd = 0;
        int sumEven = 0;
        
        for (int i = 0; i < len; i += 2) {
            sumOdd += num_list[i];
        }
        
        for (int i = 1; i < len; i += 2) {
            sumEven += num_list[i];
        }
        
        if (sumOdd > sumEven) {
            answer = sumOdd;
        } else if (sumOdd < sumEven) {
            answer = sumEven;
        } else if (sumOdd == sumEven) {
            answer = sumOdd;
        }
        return answer;
    }
}