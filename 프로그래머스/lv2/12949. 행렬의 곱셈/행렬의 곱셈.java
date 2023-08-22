class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Rows = arr1.length;
        int arr1Cols = arr1[0].length;
        int arr2Cols = arr2[0].length;
        
        int[][] answer = new int[arr1Rows][arr2Cols];
        
        for (int i = 0; i < arr1Rows; i++) {
            for (int j = 0; j < arr2Cols; j++) {
                for (int k = 0; k < arr1Cols; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}
