class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int row = 0, col = -1;
        int dir = 1;

        while(n > 0) {
            for(int i=0; i<n; i++) {
                col += dir;
                answer[row][col] = num++;
            }

            n--;

            for(int i=0; i<n; i++) {
                row += dir;
                answer[row][col] = num++;
            }

            dir *= -1;
        }

        return answer;
    }
}
