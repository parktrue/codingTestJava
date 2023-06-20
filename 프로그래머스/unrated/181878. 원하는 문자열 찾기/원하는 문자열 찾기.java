class Solution {
    public int solution(String myString, String pat) {
        int myLen = myString.length();
        int patLen = pat.length();
        char[] myChar = myString.toCharArray();
        char[] patChar = pat.toCharArray();
        
        for (int i = 0; i < myLen; i++) {
            if (myChar[i] >= 'A' && myChar[i] <= 'Z') {
                myChar[i] += 32;
            }
        }
        for (int i = 0; i < patLen; i++) {
            if (patChar[i] >= 'A' && patChar[i] <= 'Z') {
                patChar[i] += 32;
            }
        }
        
        for (int i = 0; i <= myLen - patLen; i++) {
            boolean match = true;

            for (int j = 0; j < patLen; j++) {
                if (myChar[i + j] != patChar[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return 1;
            }
        }
        return 0;
    }
}