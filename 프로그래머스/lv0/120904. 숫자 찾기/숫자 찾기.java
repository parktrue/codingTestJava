class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);
        char[] charNum = strNum.toCharArray();
        int len = strNum.length();
        char check = String.valueOf(k).charAt(0);
        
        for (int i = 0; i < len; i++) {
            if (charNum[i] == check) {
                answer = i + 1;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }
}