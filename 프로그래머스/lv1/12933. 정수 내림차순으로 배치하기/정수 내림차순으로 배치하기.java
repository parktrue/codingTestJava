class Solution {
    public long solution(long n) {
        char[] nChar = Long.toString(n).toCharArray();
        int len = nChar.length;
        char temp = '1';
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (nChar[j] < nChar[j + 1]) {
                    temp = nChar[j];
                    nChar[j] = nChar[j + 1];
                    nChar[j + 1] = temp;
                }
            }
        }
        
        String nStr = new String(nChar);
        long answer = Long.parseLong(nStr);
        return answer;
    }
}