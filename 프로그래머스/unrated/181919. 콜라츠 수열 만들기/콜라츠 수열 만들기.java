class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        int x = n;
        while (!(x == 1)) {
            if ((x & 1) == 1) {
                x = 3 * x + 1;
            } else if ((x & 1) == 0) {
                x = x / 2;
            }
            count++;
        }
        

        int[] answer = new int[count + 1];
        int i = 0;
        while (!(n == 1)) {
            answer[i] = n;
            if ((n & 1) == 1) {
                n = 3 * n + 1;
            } else if ((n & 1) == 0) {
                n = n / 2;
            }
            i++;
        }
        answer[count] = n;
        return answer;
    }
}