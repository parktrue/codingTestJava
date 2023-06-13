class Solution {
    public String solution(String myString) {
        int len = myString.length();
        char[] myChar = myString.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= 'A' && myChar[i] <= 'Z') {
                myChar[i] += 32;
            }
        }
        for (int i = 0; i < len; i++) {
            if (myChar[i] == 'a') {
                myChar[i] -= 32;
            }
        }
        String answer = new String(myChar);
        return answer;
    }
}