class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        int temp = 0;
        int count = (int) (len / 2);
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        answer = array[count];
        return answer;
    }
}