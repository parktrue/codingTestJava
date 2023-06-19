class Solution {
    public int solution(String my_string) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        int answer = 0;
        int tempNum = 0;
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= '0' && myChar[i] <= '9') {
                tempNum = tempNum * 10 + Integer.parseInt(String.valueOf(myChar[i]));
            } else {
                answer += tempNum;
                tempNum = 0;
            }
        }
        answer += tempNum;
        return answer;
    }
}