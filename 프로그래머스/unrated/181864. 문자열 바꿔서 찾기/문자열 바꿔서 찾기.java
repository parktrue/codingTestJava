class Solution {
    public int solution(String myString, String pat) {
        int len = myString.length();
        char[] myChar = myString.toCharArray();

        for (int i = 0; i < len; i++) {
            if (myChar[i] == 'A') {
                myChar[i] = 'B';
            } else if (myChar[i] == 'B') {
                myChar[i] = 'A';
            }
        }

        String myStr = new String(myChar);
        if (myStr.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}