class Solution {
    public int solution(String binomial) {
        int answer = 0;
        char[] numChar = binomial.toCharArray();
        int len = numChar.length;
        int tempNum1 = 0;
        int tempNum2 = 0;
        
        for (int i = 0; i < len; i++) {
            if (numChar[i] >= '0' && numChar[i] <= '9') {
                tempNum1 = tempNum1 * 10 + Character.getNumericValue(numChar[i]);
            }
            if (numChar[i] == '+' || numChar[i] == '-' || numChar[i] == '*') {
                tempNum2 = tempNum1;
                tempNum1 = 0;
            }
        }
        
        for (int i = 0; i < len; i++) {
            if (numChar[i] == '+') {
                answer = tempNum2 + tempNum1;
            }
            if (numChar[i] == '-') {
                answer = tempNum2 - tempNum1;
            }
            if (numChar[i] == '*') {
                answer = tempNum2 * tempNum1;
            }
        }
        return answer;
    }
}