class Solution {
    public String solution(String my_string, int[] index_list) {
        int len = index_list.length;
        char[] myChar = my_string.toCharArray();
        char[] result = new char[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = myChar[index_list[i]];
        }
        String answer = new String(result);
        return answer;
    }
}