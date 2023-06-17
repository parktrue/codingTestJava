class Solution {
    public String solution(String my_string, int[] indices) {
        int len1 = my_string.length();
        int len2 = indices.length;
        char[] myChar = my_string.toCharArray();
        
        int temp = 0;
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len2 - 1; j++) {
                if (indices[j] > indices[j + 1]) {
                    temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }
        
        int j = 0;
        int k = 0;
        char[] result = new char[len1 - len2];
        for (int i = 0; i < len1; i++) {
            if (j < len2 && i == indices[j]) {
                j++;
            } else {
                result[k] = myChar[i];
                k++;
            }
        }
        
        String answer = new String(result);
        return answer;
    }
}