class Solution {
    public String solution(String my_string, int[][] queries) {
        int len = my_string.length();
        int qlen = queries.length;
        char[] myChar = my_string.toCharArray();
        char[] result = new char[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = myChar[i];
        }

        for (int i = 0; i < qlen; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start, k = end; j < k; j++, k--) {
                char temp = result[j];
                result[j] = result[k];
                result[k] = temp;
            }
        }
    
        String answer = new String(result);
        return answer;
    }
}