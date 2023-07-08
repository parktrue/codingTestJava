class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int stackSize = 0;

        for (int i = 0; i < arr.length; i++) {
            if (stackSize == 0 || stk[stackSize - 1] != arr[i]) {
                stk[stackSize++] = arr[i];
            } else if (stk[stackSize - 1] == arr[i]) {
                --stackSize;
            }
        }
        
        if (stackSize == 0) {
            return new int[] {-1};
        } else {
            int[] answer = new int[stackSize];
            for (int i = 0; i < stackSize; i++) {
                answer[i] = stk[i];
            }
            return answer;
        }
    }
}
