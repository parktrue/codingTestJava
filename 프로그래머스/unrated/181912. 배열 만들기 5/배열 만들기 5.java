class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        Long[] temp = new Long[len];
        
        for (int i = 0; i < len; i++) {
            temp[i] = Long.valueOf(intStrs[i].substring(s, s + l));
        }
        
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (temp[i] > k) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        for (int i = 0, j = 0; i < len; i++) {
                if (temp[i] > k) {
                    answer[j] = temp[i].intValue();
                    j++;
            }
        }
        
        return answer;
    }
}