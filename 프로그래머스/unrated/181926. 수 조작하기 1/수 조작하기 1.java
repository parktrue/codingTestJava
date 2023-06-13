class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int len = control.length();
        char[] ctlChar = control.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (ctlChar[i] == 'w') {
                n++;
            } else if (ctlChar[i] == 's') {
                n--;
            } else if (ctlChar[i] == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}