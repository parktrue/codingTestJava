class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;
        int len = numlist.length;
        
        for (int i = 0; i < len; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (numlist[i] % n == 0) {
                result[j] = numlist[i];
                j++;
            }
        }
        
        answer = result;
        return answer;
    }
}