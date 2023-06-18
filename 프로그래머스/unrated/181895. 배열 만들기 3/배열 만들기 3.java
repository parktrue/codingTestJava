class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = arr.length;
        int resultLen = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        int[] result = new int[resultLen];
        
        int j= 0;
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            result[j] = arr[i];
            j++;
        }
        
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            result[j] = arr[i];
            j++;
        }
        
        return result;
    }
}