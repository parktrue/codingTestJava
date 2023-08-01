class Solution {
    public int solution(int n) {
        int numOfOne = Integer.bitCount(n);
        int nextNum = n + 1;
        
        while (Integer.bitCount(nextNum) != numOfOne) {
            nextNum++;
        }
        
        return nextNum;
    }
}
