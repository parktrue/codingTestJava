class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int i;
        
        int str1Length = str1.length();
        int str2Length = str2.length();
        int strLength = str1Length + str2Length;
        
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        
        char[] str = new char[strLength];
        
        for (i = 0; i < str1Length; i++) {
            str[i * 2] = str1Arr[i];
            str[i * 2 + 1] = str2Arr[i];
        }
        answer = new String(str);
        return answer;
    }
}