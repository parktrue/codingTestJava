class Solution {
    public String solution(String n_str) {
        int len = n_str.length();
        char[] nChar = n_str.toCharArray();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nChar[i] >= '1' && nChar[i] <= '9') {
                count = i;
                break;
            }
        }
        
        int j = 0;
        char[] result = new char[len - count];
        for (int i = count; i < len; i++) {
            result[j] = nChar[i];
            j++;
        }
        String answer = new String(result);
        return answer;
    }
}