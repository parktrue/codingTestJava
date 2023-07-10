class Solution {
    public int solution(int[] array) {
        int N = 1000;
        int[] counts = new int[N];
        int maxCount = 0;
        int mode = -1;
        
        for (int num : array) {
            counts[num]++;
            if (counts[num] > maxCount) {
                maxCount = counts[num];
                mode = num;
            }
        }
        
        int modeCount = 0;
        for (int i = 0; i < N; i++) {
            if (counts[i] == maxCount) {
                modeCount++;
            }
            if (modeCount > 1) {
                return -1;
            }
        }
        
        return mode;
    }
}