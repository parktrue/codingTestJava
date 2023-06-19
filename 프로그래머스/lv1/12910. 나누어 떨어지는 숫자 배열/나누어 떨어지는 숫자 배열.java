class Solution {
    public int[] solution(int[] arr, int divisor) {
        int len = arr.length;
        int[] result = new int[len];
        int count = 0;
        int j = 0;
        
        for (int i = 0; i < len; i++) {
            if ((arr[i] % divisor) == 0) {
                result[j] = arr[i];
                j++;
                count++;
            } else if (count == 0 && i == len - 1) {
                int[] none = {-1};
                return none;
            }
        }
        
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = result[i];
        }
        
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count - 1; k++) {
                if (answer[k] > answer[k + 1]) {
                    temp = answer[k];
                    answer[k] = answer[k + 1];
                    answer[k + 1] = temp;
                }
            }
        }
        
        return answer;
    }
}