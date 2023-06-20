class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int temp = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (Math.abs(numlist[j] - n) > Math.abs(numlist[j + 1] - n) ||
                    (Math.abs(numlist[j] - n) == Math.abs(numlist[j + 1] - n) && numlist[j] < numlist[j + 1])) {
                    temp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = temp;
                }
            }
        }
        return numlist;
    }
}
