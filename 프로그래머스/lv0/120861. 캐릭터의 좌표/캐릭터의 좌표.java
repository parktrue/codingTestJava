class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;

        for (String input : keyinput) {
            switch (input) {
                case "up":
                    if (y + 1 <= (board[1] - 1) / 2) {
                        y += 1;
                    }
                    break;
                case "down":
                    if (y - 1 >= -(board[1] - 1) / 2) {
                        y -= 1;
                    }
                    break;
                case "left":
                    if (x - 1 >= -(board[0] - 1) / 2) {
                        x -= 1;
                    }
                    break;
                case "right":
                    if (x + 1 <= (board[0] - 1) / 2) {
                        x += 1;
                    }
                    break;
                default:
                    break;
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
