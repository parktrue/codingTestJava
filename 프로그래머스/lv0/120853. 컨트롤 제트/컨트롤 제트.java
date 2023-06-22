class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        int len = str.length;
        int num = 0;
        
        for (int i = 0; i < len; i++) {
            if (str[i].equals("Z")) {
                if (i > 0) {
                num -= Integer.parseInt(str[i - 1]);
                }
            } else {
                num += Integer.parseInt(str[i]);
            }
        }
        
        answer = num;
        return answer;
    }
}