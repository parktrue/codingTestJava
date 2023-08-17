import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int photoScore = 0;
            for (String person : photo[i]) {
                if (yearningMap.containsKey(person)) {
                    photoScore += yearningMap.get(person);
                }
            }
            answer[i] = photoScore;
        }
        
        return answer;
    }
}
