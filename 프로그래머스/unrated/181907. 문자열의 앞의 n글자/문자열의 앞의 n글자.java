class Solution {
    public String solution(String my_string, int n) {
        char[] myChar = new char[n];
        char[] strChar = my_string.toCharArray();
        int len = my_string.length();
        
        for (int i = 0; i < n; i++) {
            myChar[i] = strChar[i];
        }
        String answer = new String(myChar);
        return answer;
    }
}