class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        char temp;
        char[] str = my_string.toCharArray();
        
        for (int i = 0; i < len / 2; i++) {
            temp = str[i];
            str[i] = str[len - i - 1];
            str[len - i - 1] = temp;
        }
        String newStr = new String(str);
        answer = newStr;
        return answer;
    }
}