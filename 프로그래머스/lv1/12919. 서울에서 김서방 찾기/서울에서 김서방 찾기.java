class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int len = seoul.length;
        
        for (int i = 0; i < len; i++) {
            if (seoul[i].equals("Kim")) {
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }
        return answer;
    }
}