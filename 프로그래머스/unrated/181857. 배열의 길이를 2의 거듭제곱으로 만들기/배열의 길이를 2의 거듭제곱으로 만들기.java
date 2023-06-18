class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int tempLen = len;
        
        if ((len & (len - 1)) != 0) {
            while (true) {
                len++;
                if ((len & (len - 1)) == 0) {
                    break;
                }
            }
        }
        
        int[] answer = new int [len];
        for (int i = 0; i < tempLen; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}