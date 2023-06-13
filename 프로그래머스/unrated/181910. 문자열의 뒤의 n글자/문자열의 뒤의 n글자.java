class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        char[] myChar = new char[n];
        char[] strChar = my_string.toCharArray();
        int j = 0;
        for (int i = len - n; i < len; i++) {
            myChar[j] = strChar[i];
            j++;
        }
        String answer = new String(myChar);
        return answer;
    }
}