class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        
        for (int i : array) {
            sb.append(i);
        }
        
        String str = sb.toString();
        int len = str.length();
        char[] strChar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (strChar[i] == '7') {
                count++;
            }
        }
        int answer = count;
        return answer;
    }
}