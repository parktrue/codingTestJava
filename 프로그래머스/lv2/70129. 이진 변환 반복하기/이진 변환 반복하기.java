class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            String temp = "";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    temp += '1';
                } else {
                    count++;
                }
            }
            answer[1] += count;
            s = Integer.toBinaryString(temp.length());
            answer[0]++;
        }
        
        return answer;
    }
}
