class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= 'a' && myChar[i] <= 'z') {
                myChar[i] -= 32;
            } else {
                myChar[i] += 32;
            }
        }
        String myStr = new String(myChar);
        answer = myStr;
        
        return answer;
    }
}