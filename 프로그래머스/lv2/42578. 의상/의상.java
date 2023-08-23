import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        
        for (int value : clothesMap.values()) {
            answer *= (value + 1);
        }
        
        answer -= 1;
        
        return answer;
    }
}
