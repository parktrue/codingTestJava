class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int sum = 0;
        int len = my_string.length();
        
        char[] myChar = my_string.toCharArray();
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= '0' && myChar[i] <= '9') {
                sum += Character.getNumericValue(myChar[i]);
            }
        }
        answer = sum;
        
        return answer;
    }
}