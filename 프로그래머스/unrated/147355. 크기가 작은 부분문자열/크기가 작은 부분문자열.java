class Solution {
    public int solution(String t, String p) {
        long count = 0;
        long pValue = Long.parseLong(p);
        int pLen = p.length();
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            long resultValue = Long.parseLong(t.substring(i, i + pLen));
            if (resultValue <= pValue) {
                count++;
            }
        }
        
        return (int) count;
    }
}