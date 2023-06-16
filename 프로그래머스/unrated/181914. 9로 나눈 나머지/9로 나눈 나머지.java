class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int len = number.length();
        char[] numChar = number.toCharArray();
        
        int sum = 0;
        for (int i = 0; i < len; i++){
            sum += Character.getNumericValue(numChar[i]);
        }
        answer = sum % 9;
        return answer;
    }
}