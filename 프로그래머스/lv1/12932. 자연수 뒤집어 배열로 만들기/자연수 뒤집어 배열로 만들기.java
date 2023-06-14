class Solution {
    public int[] solution(long n) {
        char[] nChar = Long.toString(n).toCharArray();
        int len = nChar.length;
        int[] answer = new int[len];
        
        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            answer[j] = Character.getNumericValue(nChar[i]);
            j++;
        }
        return answer;
    }
}