class Solution {
    public String solution(String my_string, int num1, int num2) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        
        char temp = 'a';
        temp = myChar[num1];
        myChar[num1] = myChar[num2];
        myChar[num2] = temp;
        
        String answer = new String(myChar);
        return answer;
    }
}