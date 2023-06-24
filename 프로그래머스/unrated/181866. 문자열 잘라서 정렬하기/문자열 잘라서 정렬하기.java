import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] tempString = myString.split("x");
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : tempString) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
            
        return answer;
    }
}