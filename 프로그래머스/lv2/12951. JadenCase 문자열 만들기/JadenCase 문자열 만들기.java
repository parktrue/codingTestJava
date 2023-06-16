class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (sChar[i] >= 'A' && sChar[i] <= 'Z') {
                sChar[i] += 32;
            }
        }
        
        for (int i = 0; i < len; i++) {
            if ((sChar[0] >= 'a' && sChar[0] <= 'z') && i == 0) {
                sChar[0] -= 32;
            }
            if (sChar[i] == 32 && i < len - 2) {
                if (sChar[i + 1] >= 'a' && sChar[i + 1] <= 'z') {
                    sChar[i + 1] -= 32;
                }
            }
        }
        
        String answer = new String(sChar);
        return answer;
    }
}