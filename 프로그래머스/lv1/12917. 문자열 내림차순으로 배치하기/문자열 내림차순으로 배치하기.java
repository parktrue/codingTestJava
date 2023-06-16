class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        char temp = 'a';
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (sChar[j] < sChar[j + 1]) {
                    temp = sChar[j];
                    sChar[j] = sChar[j + 1];
                    sChar[j + 1] = temp;
                }
            }
        }
        String answer = new String(sChar);
        return answer;
    }
}