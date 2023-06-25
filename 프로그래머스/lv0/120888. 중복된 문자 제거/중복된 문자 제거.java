class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            if (my_string.indexOf(c) == i) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}