class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            if (myChar[i] == 'a' || myChar[i] == 'e' || myChar[i] == 'i' || myChar[i] == 'o' || myChar[i] == 'u') {
                count++;
            }
        }
        
        char[] result = new char[len - count];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (!(myChar[i] == 'a' || myChar[i] == 'e' || myChar[i] == 'i' || myChar[i] == 'o' || myChar[i] == 'u')) {
            result[j] = myChar[i];
            j++;
            }
        }
        String answer = new String(result);
        return answer;
    }
}