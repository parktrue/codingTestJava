class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n + 1];

        for (int citation : citations) {
            if (citation >= n) {
                counts[n]++;
            } else {
                counts[citation]++;
            }
        }

        int hIndex = 0;

        for (int h = n; h >= 0; h--) {
            hIndex += counts[h];
            if (hIndex >= h) {
                hIndex = h;
                break;
            }
        }

        return hIndex;
    }
}
