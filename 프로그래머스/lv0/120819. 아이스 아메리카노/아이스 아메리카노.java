class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        if (money < 5500) {
            answer[0] = 0;
            answer[1] = money;
            return answer;
        }
        answer[0] = (int) (money / 5500);
        answer[1] = money - (int) (money / 5500) * 5500;
        return answer;
    }
}