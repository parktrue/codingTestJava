class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        int maxCount = 0;

        for(String str : strArr) {
            int len = str.length();
            count[len]++;
            if(count[len] > maxCount) {
                maxCount = count[len];
            }
        }

        return maxCount;
    }
}
