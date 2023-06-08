class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int length = array.length;
        int check = 0;
        
        for (int i = 0; i < length; i++) {
            if (array[i] == n) {
                check++;
            }
        }
        answer = check;
        return answer;
    }
}