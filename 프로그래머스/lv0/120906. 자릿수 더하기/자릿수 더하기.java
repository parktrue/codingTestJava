class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = Integer.toString(n);
        char[] nChar = nStr.toCharArray();
        int len = nChar.length;
        
        for (int i = 0; i < len; i++) {
            answer += Character.getNumericValue(nChar[i]);
        }
        return answer;
    }
}