class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            if ((count & 1) == 0) {
                if (sChar[i] >= 'a' && sChar[i] <= 'z') {
                    sChar[i] -= 32;
                }
            } else if ((count & 1) == 1) {
                if (sChar[i] >= 'A' && sChar[i] <= 'Z') {
                    sChar[i] += 32;
                }
            }
            if (sChar[i] == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        
        String answer = new String(sChar);
        return answer;
    }
}