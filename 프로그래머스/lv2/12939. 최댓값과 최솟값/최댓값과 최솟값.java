class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int len = str.length;
        int[] temp = new int[len];
        int[] temp2 = new int[2];
        
        
        for (int i = 0; i < len; i++) {
            temp[i] = Integer.parseInt(str[i]);
        }
        
        int tempNum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    tempNum = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempNum;
                }
            }
        }
        
        temp2[0] = temp[0];
        temp2[1] = temp[len - 1];
        String answer = temp2[0] + " " + temp2[1];
        return answer;
    }
}