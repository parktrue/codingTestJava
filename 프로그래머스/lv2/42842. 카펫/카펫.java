class Solution {
    public int[] solution(int brown, int yellow) {
        for (int h = 3; h <= (int) (brown + 4) / 2; h++) {
            int w = ((brown + 4) / 2) - h;
            if (w < h) {
                break;
            }
            int yellowCnt = (w - 2) * (h - 2);
            if (yellow == yellowCnt) {
                return new int[]{w, h};
            }
        }
        return null;
    }
}
