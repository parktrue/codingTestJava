class Solution {
    public int[] solution(int num, int total) {
        int middle = total / num;
        if (total % num * 2 >= num) {
            middle++;
        }

        int start = middle - num / 2;
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}
