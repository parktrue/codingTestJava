class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int len = num_list.length;
        int[] result = new int[len];
        int count = 0;
        int j = 0;
        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                result[j] = num_list[i];
                j++;
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < len; i++) {
                result[j] = num_list[i];
                j++;
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                result[j] = num_list[i];
                j++;
            }
        } else if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                result[j] = num_list[i];
                j++;
            }
        }
        
        int[] answer = new int[j];
        for (int i = 0; i < j; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}