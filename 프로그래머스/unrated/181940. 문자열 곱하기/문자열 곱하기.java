class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int i;
        
        for (i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}