class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        int len1 = arr.length;
        int len2 = delete_list.length;
        int[] result = new int[len1];
        int count = 0;
        
        loop:
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (arr[i] == delete_list[j]) {
                    continue loop;
                }
            }
            result[count++] = arr[i];
        }
        
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}