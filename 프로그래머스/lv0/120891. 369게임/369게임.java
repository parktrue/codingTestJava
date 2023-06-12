class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        char[] orderChar = orderStr.toCharArray();
        int len = orderStr.length();
        
        for (int i = 0; i < len; i++) {
            if (orderChar[i] == '3' || orderChar[i] == '6' || orderChar[i] == '9') {
                answer++;
            }
        }
        return answer;
    }
}