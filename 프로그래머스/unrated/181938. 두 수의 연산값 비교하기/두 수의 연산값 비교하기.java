class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        String abStr = aStr + bStr;
        
        int abNum = Integer.parseInt(abStr);
        if (abNum > 2 * a * b) {
            answer = abNum;
        } else if (abNum < 2 * a * b) {
            answer = 2 * a * b;
        } else {
            answer = abNum;
        }
        return answer;
    }
}