class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        char[] sChar = s.toCharArray();
        
        if (sChar[0] == '-') {
            String result = new String(sChar, 1, len - 1);
            answer = Integer.parseInt(result) * -1;
            return answer;
        } else {
            String result = new String(sChar);
            answer = Integer.parseInt(result);
            return answer;
        }
    }
}