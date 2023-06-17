class Solution {
    public int[] solution(String myString) {
        int len = myString.length();
        int[] result = new int[len];
        int count = 0;
        int j = 0;
        char[] myChar = myString.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] != 'x') {
                count++;
            } else {
                result[j++] = count;
                count = 0;
            }
        }
        result[j++] = count;
        
        int[] answer = new int[j];
        for (int i = 0; i < j; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}