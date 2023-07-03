class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        
        int[] indexCheck = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                indexCheck[j] = i;
                j++;
            }
        }
        if (count == 0) {
            return new int[] {-1};
        } else if (count == 1) {
            return new int[] {arr[indexCheck[0]]};
        }
        
        int len = indexCheck.length;
        int[] answer = new int[indexCheck[count - 1] - indexCheck[0] + 1];
        int k = 0;
        for (int i = indexCheck[0]; i <= indexCheck[count - 1]; i++) {
            answer[k] = arr[i];
            k++;
        }
        return answer;
    }
}