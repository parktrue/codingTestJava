class Solution {
    public String solution(String myString) {
        int len = myString.length();
        char[] myChar = myString.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= 'a' && myChar[i] <= 'l') {
                myChar[i] = 'l';
            }
        }
        String answer = new String(myChar);
        return answer;
    }
}