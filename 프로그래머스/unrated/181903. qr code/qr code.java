class Solution {
    public String solution(int q, int r, String code) {
        int len = code.length();
        char[] codeChar = code.toCharArray();
        int count = 0;
        
        for (int i = 0; i < len ; i++) {
            if (i % q == r) {
                count++;
            }
        }
        
        char[] result = new char[count];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (i % q == r) {
                result[j] = codeChar[i];
                j++;
            }
        }
        
        String answer = new String(result);
        return answer;
    }
}