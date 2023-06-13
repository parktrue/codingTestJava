class Solution {
    public int[] solution(int start, int end) {
        int j = 0;
        int[] num = new int[end - start + 1];
        
        for (int i = start; i <= end; i++) {
            num[j] = i;
            j++;
        }
        return num;
    }
}