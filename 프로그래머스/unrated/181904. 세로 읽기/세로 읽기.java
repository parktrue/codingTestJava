class Solution {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        char[] result = new char[len / m];
        int j = 0;
        
        for (int i = c - 1; i < len; i += m) {
            result[j] = myChar[i];
            j++;
        }
        
        String answer = new String(result);
        return answer;
    }
}