class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] sChar = s.toCharArray();
        
        if ((len & 1) == 0) {
            char[] result1 = new char[2];
            result1[0] = sChar[len / 2 - 1];
            result1[1] = sChar[len / 2];
            String answer1 = new String(result1);
            return answer1;
        } else {
            char[] result2 = new char[1];
            result2[0] = sChar[len / 2];
            String answer2 = new String(result2);
            return answer2;
        }
    }
}