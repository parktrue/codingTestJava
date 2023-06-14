class Solution {
    public String solution(String rny_string) {
        int len = rny_string.length();
        char[] rnyChar = rny_string.toCharArray();
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (rnyChar[i] == 'm') {
                count++;
            }
        }

        char[] result = new char[len + count * 2];
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (rnyChar[i] == 'm') {
                result[k] = 'r';
                result[k + 1] = 'n';
                k = k + 2;
            } else {
                result[k] = rnyChar[i];
                k++;
            }
        }
        String answer = new String(result, 0, k);
        return answer;
    }
}
