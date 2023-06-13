class Solution {
    public String solution(int[] numLog) {
        int len = numLog.length;
        char[] result = new char[len - 1];
        
        for (int i = 0; i < len - 1; i++) {
            if ((numLog[i] - numLog[i + 1]) == -1) {
                result[i] = 'w';
            } else if ((numLog[i] - numLog[i + 1]) == 1) {
                result[i] = 's';
            } else if ((numLog[i] - numLog[i + 1]) == -10) {
                result[i] = 'd';
            } else if ((numLog[i] - numLog[i + 1]) == 10) {
                result[i] = 'a';
            }
        }
        String answer = new String(result);
        return answer;
    }
}