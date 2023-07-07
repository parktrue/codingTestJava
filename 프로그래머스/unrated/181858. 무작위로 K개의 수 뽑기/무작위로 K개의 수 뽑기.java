class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] existence = new int[100001]; 
        int count = 0;

        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (existence[arr[i]] == 0) { 
                existence[arr[i]] = 1; 
                answer[count] = arr[i];
                count++;
                if (count == k) {
                    break; 
                }
            }
        }
        
        return answer;
    }
}
