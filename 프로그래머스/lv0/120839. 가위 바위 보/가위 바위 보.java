class Solution {
    public String solution(String rsp) {
        int len = rsp.length();
        char[] rspChar = rsp.toCharArray();
        char[] result = new char[len];
        
        for (int i = 0; i < len; i++) {
            if (rspChar[i] == '0') {
                result[i] = '5';
            } else if (rspChar[i] == '2') {
                result[i] = '0';
            } else {
                result[i] = '2';
            }
        }
        String answer = new String(result);
        return answer;
    }
}