class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                answer += myChar[i];
            }
        }
        return answer;
    }
}