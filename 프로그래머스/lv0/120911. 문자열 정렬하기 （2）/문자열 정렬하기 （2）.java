class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= 'A' && myChar[i] <= 'Z') {
                myChar[i] += 32;
            }
        }
        char temp = 'a';
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (myChar[j] > myChar[j + 1]) {
                    temp = myChar[j];
                    myChar[j] = myChar[j + 1];
                    myChar[j + 1] = temp;
                }
            }
        }
        String answer = new String(myChar);
        return answer;
    }
}