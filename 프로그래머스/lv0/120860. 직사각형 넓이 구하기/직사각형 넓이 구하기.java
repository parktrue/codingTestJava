class Solution {
    public int solution(int[][] dots) {
        int width = 0, height = 0;
        for(int i = 1; i < 4; i++) {
            int tempWidth = dots[0][0] - dots[i][0];
            tempWidth = (tempWidth < 0) ? -tempWidth : tempWidth;
            width = (width < tempWidth) ? tempWidth : width;
        }

        for(int i = 1; i < 4; i++) {
            int tempHeight = dots[0][1] - dots[i][1];
            tempHeight = (tempHeight < 0) ? -tempHeight : tempHeight;
            height = (height < tempHeight) ? tempHeight : height;
        }

        int area = width * height;
        return area;
    }
}
