class Solution {
    public String solution(String s, int n) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (sChar[i] >= 'a' && sChar[i] <= 'z') {
                if (sChar[i] + n > 'z') {
                    sChar[i] += -26;
                }
                sChar[i] += n;
            } else if (sChar[i] >= 'A' && sChar[i] <= 'Z') {
                if (sChar[i] + n > 'Z') {
                    sChar[i] += -26;
                }
                sChar[i] += n;
            }
        }
        String answer = new String(sChar);
        return answer;
    }
}