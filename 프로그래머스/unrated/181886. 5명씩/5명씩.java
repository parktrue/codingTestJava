class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        int count = 0;
        
        for (int i = 0; i < len; i += 5) {
            count++;
        }
        String[] answer = new String[count];
        
        int j = 0;
        for (int i = 0; i < len; i += 5) {
            answer[j] = names[i];
            j++;
        }
        
        return answer;
    }
}