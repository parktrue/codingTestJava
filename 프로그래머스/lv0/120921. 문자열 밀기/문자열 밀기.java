class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        
        int len = A.length();
        char[] aChar = A.toCharArray();
        char[] tempChar = new char[len];
        int count = 0;
        
        for (int i = 0, j = 1; count < len; ) {
            tempChar[j] = aChar[i];
            i = (i + 1) % len;
            j = (j + 1) % len;
            if (j == 0) { 
                tempChar[0] = aChar[len - 1];
                String result = new String(tempChar);
                if (result.equals(B)) {
                    return count + 1;
                }
                aChar = tempChar.clone();
                count++;
            }
        }

        return -1;
    }
}