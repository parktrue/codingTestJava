class Solution {
    public String solution(int n) {
        char[] result = new char[n];
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = '수';
            } else {
                result[i] = '박';
            }
        }
        
        String answer = new String(result);
        return answer;
    }
}