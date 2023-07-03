class Solution {
    public int solution(String t, String p) {
        int count = 0;
        Long pValue = Long.parseLong(p);
        int pLen = p.length();
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            Long resultValue = Long.parseLong(t.substring(i, i + pLen));
            if (resultValue <= pValue) {
                count++;
            }
        }
        
        return count;
    }
}