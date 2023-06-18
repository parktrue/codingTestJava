class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = todo_list.length;
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            if (finished[i] == false) {
                count++;
            }
        }
        
        int j = 0;
        String[] answer = new String[count];
        for (int i = 0; i < len; i++) {
            if (finished[i] == false) {
                answer[j]= todo_list[i];
                j++;
            }
        }
        return answer;
    }
}