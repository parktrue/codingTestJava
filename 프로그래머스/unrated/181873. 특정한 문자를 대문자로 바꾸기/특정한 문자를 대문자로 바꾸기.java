class Solution {
    public String solution(String my_string, String alp) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        char[] alpChar = alp.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] == alpChar[0]) {
                myChar[i] -= 32;
            }
        }
        
        String answer = new String(myChar);
        return answer;
    }
}