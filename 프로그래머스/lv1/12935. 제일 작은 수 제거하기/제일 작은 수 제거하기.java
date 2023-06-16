class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] tempArr = new int[len];
        for (int i = 0; i < len; i++) {
            tempArr[i] = arr[i];
        }
        
        if (len == 1) {
            int[] result = {-1};
            return result;
        }
        
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        int min = arr[0];
        int k = 0;
        int[] answer = new int[len - 1];
        for (int i = 0; i < len; i++) {
            if (!(min == tempArr[i])) {
                answer[k] = tempArr[i];
                k++;
            }
        }
        
        return answer;
    }
}