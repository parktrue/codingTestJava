class Solution {
    public int solution(String before, String after) {
        int[] frequency = new int[26];
        
        for (char ch : before.toCharArray()) {
            frequency[ch - 'a']++;
        }
        
        for (char ch : after.toCharArray()) {
            if (frequency[ch - 'a'] == 0) {
                return 0;
            }
            frequency[ch - 'a']--;
        }
        
        return 1;
    }
}
