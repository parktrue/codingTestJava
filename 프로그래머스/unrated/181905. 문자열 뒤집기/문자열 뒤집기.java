class Solution {
    public String solution(String my_string, int s, int e) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        char[] result = new char[len];
        int j = 0;
        
        for (int i = 0; i < len; i++) {
            if (i >= s && i < e + 1) {
                result[i] = myChar[e - j];
                j++;
            } else {
                result[i] = myChar[i];
            }
        }
        
        String answer = new String(result);
        return answer;
    }
}