class Solution {
    public String solution(String s, int n) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (sChar[i] >= 97 && sChar[i] <= 122) {
                if (sChar[i] + n >= 123) {
                    sChar[i] += (-26 + n - n);
                }
                sChar[i] += n;
            } else if (sChar[i] >= 65 && sChar[i] <= 90) {
                if (sChar[i] + n >= 91) {
                    sChar[i] += (-26 + n - n);
                }
                sChar[i] += n;
            }
        }
        String answer = new String(sChar);
        return answer;
    }
}