class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        if ((len & 1) == 1) {
            for (int i = 0; i < len; i++) {
                if ((i & 1) == 0) {
                    arr[i] += n;
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                if ((i & 1) == 1) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}