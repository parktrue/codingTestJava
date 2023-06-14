class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] xChar = Integer.toString(x).toCharArray();
        int len = xChar.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            sum += Character.getNumericValue(xChar[i]);
        }
        
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}