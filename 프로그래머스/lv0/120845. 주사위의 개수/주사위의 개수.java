class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        if (box[0] == n && box[0] == n && box[0] == n) {
            answer = 1;
            return answer;
        }
        answer = (int) (box[0] / n) * (int) (box[1] / n) * (int) (box[2] / n);
        return answer;
    }
}