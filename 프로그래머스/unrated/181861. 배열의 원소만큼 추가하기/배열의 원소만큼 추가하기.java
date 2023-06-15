class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            count += arr[i];
        }
        
        int[] answer = new int[count];
        int k = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[k] = arr[i];
                k++;
            }
        }
        return answer;
    }
}