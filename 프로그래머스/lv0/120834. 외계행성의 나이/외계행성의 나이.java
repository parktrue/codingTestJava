class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        int len = ageStr.length();
        char[] ageChar = ageStr.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (ageChar[i] == '0') {
                ageChar[i] = 'a';
            } else if (ageChar[i] == '1') {
                ageChar[i] = 'b';
            } else if (ageChar[i] == '2') {
                ageChar[i] = 'c';
            } else if (ageChar[i] == '3') {
                ageChar[i] = 'd';
            } else if (ageChar[i] == '4') {
                ageChar[i] = 'e';
            } else if (ageChar[i] == '5') {
                ageChar[i] = 'f';
            } else if (ageChar[i] == '6') {
                ageChar[i] = 'g';
            } else if (ageChar[i] == '7') {
                ageChar[i] = 'h';
            } else if (ageChar[i] == '8') {
                ageChar[i] = 'i';
            } else if (ageChar[i] == '9') {
                ageChar[i] = 'j';
            }
        }
        String answer = new String(ageChar);
        return answer;
    }
}