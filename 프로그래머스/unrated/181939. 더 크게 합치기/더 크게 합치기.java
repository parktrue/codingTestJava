class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        String abStr = aStr + bStr;
        String baStr = bStr + aStr;
        
        int abNum = Integer.parseInt(abStr);
        int baNum = Integer.parseInt(baStr);
        
        if (abNum > baNum) {
            answer = abNum;
        } else if (abNum < baNum) {
            answer = baNum;
        } else {
            answer = abNum;
        }      
        return answer;
    }
}