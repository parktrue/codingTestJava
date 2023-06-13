class Solution {
    public int[] solution(String my_string) {
        char[] az = new char[26];
        char[] AZ = new char[26];
        
        int a = 97;
        int A = 65;
        for (int i = 0; i < 26; i++) {
            az[i] = (char) a;
            a++;
        }
        
        for (int i = 0; i < 26; i++) {
            AZ[i] = (char) A;
            A++;
        }
        
        String azStr = new String(az);
        String AZStr = new String(AZ);
        String AtoZstr = AZStr + azStr;
        
        int len = my_string.length();
        int[] answer = new int[52];
        char[] AtoZChar = AtoZstr.toCharArray();
        char[] myChar = my_string.toCharArray();
        for (int i = 0; i < 52; i++) {
            for (int j = 0; j < len; j++) {
                if (AtoZChar[i] == myChar[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}