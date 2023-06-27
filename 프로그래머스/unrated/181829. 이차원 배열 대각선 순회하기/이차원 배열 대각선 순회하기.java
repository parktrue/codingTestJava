class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int len = board.length;
        int colLen = board[0].length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < colLen; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}