class Solution {
    public String[] solution(String myStr) {
        String[] splitStr = myStr.split("[abc]");
        String[] newStr = new String[splitStr.length];
        int count = 0;
        
        for (String s : splitStr) {
            if (!s.isEmpty()) {
                newStr[count++] = s;
            }
        }
        
        if (count == 0) {
            return new String[] {"EMPTY"};
        }
        
        String[] answer = new String[count];
        System.arraycopy(newStr, 0, answer, 0, count);
        
        return answer;
    }
}