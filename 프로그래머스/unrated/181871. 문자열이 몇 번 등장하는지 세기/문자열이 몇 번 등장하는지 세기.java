class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] myChar = myString.toCharArray();
        char[] patChar = pat.toCharArray();
        int myLen = myString.length();
        int patLen = pat.length();
        int j = 0;
        
        for (int i = 0; i < myLen; i++) {
            if (myChar[i] == patChar[j]) {
                j++;
            } else {
                if (j > 0) {
                    i -= j;
                }
                j = 0;
            }
            
            if (j == patLen) {
                answer++;
                i = i - j + 1;
                j = 0;
            }
        }
        return answer;
    }
}
