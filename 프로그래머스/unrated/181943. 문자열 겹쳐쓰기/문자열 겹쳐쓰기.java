class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int myLength = my_string.length();
        int ovLength = overwrite_string.length();
        int minLength;

        if (ovLength < myLength - s) {
            minLength = ovLength;
        } else {
            minLength = myLength - s;
        }
        
        char[] myStr = my_string.toCharArray();
        char[] ovStr = overwrite_string.toCharArray();
        int i;
        
        for(i = s; i < s + minLength; i++) {
            myStr[i] = ovStr[i - s];
        }
        String newStr = new String(myStr);
        answer = newStr;
        return answer;
    }
}