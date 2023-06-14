class Solution {
    public String solution(String phone_number) {
        
        int len = phone_number.length();
        char[] numChar = phone_number.toCharArray();
        
        for (int i = 0; i < len - 4; i++) {
            numChar[i] = '*';
        }
        String answer = new String(numChar);
            
        return answer;
    }
}