class Solution {
    public boolean solution(String s) {
        int len = s.length();
        boolean answer = true;
        if (!(len == 4 || len == 6)) {
            answer = false;
            return answer;
        } else {
            char[] sChar = s.toCharArray();
            for (int i = 0; i < len; i++) {
                if ((sChar[i] >= 'a' && sChar[i] <= 'z') || sChar[i] >= 'A' && sChar[i] <= 'Z') {
                    answer = false;
                    return answer;
                }
            }
            return answer;
        }
    }
}