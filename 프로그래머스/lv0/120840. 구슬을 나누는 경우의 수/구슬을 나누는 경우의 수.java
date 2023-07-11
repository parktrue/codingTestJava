class Solution {
    public long solution(int balls, int share) {
        long answer = 1L;
        int count = 1;

        while (count <= share) {
            answer *= balls--;
            answer /= count++;
        }

        return answer;
    }
}
