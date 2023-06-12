class Solution {
    public int[] solution(String my_string) {
        int len = my_string.length();
        int[] result = new int[len];
        char[] myChar = my_string.toCharArray();
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= '0' && myChar[i] <= '9') {
                result[count] = Character.getNumericValue(myChar[i]);
                count++;
            }
        }
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = result[i];
        }
        
        return answer;
    }
}