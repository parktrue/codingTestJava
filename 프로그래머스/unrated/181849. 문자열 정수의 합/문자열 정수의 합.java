class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int len = num_str.length();
        char[] numChar = num_str.toCharArray();
        
        for (int i = 0; i < len; i++) {
            answer += (numChar[i] - '0');
        }
        return answer;
    }
}