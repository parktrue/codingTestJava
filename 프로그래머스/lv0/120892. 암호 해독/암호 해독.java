class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int len = cipher.length();
        char[] cipherChar = cipher.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if ((i + 1) % code== 0) {
                answer += cipherChar[i];
            }
        }
        return answer;
    }
}