class Solution {
    public int[] solution(int n, int k) {
        int len = (int) (n / k);
        int[] answer = new int[len];
        int j = k;
        
        for (int i = 0; i < len; i++) {
            answer[i] = k;
            k = j + k;
        }
        return answer;
    }
}