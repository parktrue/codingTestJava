class Solution {
    public int solution(int[][] dots) {
        // 각 점의 좌표를 분리
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];

        // 각 경우에 대한 기울기 계산
        double gradient1 = (double)(y2 - y1) / (x2 - x1);
        double gradient2 = (double)(y4 - y3) / (x4 - x3);

        // 평행한지 비교
        if (gradient1 == gradient2) return 1;

        gradient1 = (double)(y3 - y1) / (x3 - x1);
        gradient2 = (double)(y4 - y2) / (x4 - x2);

        if (gradient1 == gradient2) return 1;

        gradient1 = (double)(y4 - y1) / (x4 - x1);
        gradient2 = (double)(y3 - y2) / (x3 - x2);

        if (gradient1 == gradient2) return 1;

        return 0;
    }
}
