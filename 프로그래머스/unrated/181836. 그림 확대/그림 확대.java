class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length;
        String[] answer = new String[len * k]; 

        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : picture[i].toCharArray()) {
                for (int x = 0; x < k; x++) {
                    sb.append(c);
                }
            }
            String row = sb.toString();
            for (int x = 0; x < k; x++) {
                answer[i * k + x] = row;
            }
        }

        return answer;
    }
}