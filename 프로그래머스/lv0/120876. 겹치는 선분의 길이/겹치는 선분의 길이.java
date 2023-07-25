import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> points = new ArrayList<>();
        
        for(int[] line : lines) {
            points.add(line[0]);
            points.add(line[1]);
        }
        
        Collections.sort(points);
        for(int i = 0; i < points.size() - 1; i++) {
            int start = points.get(i);
            int end = points.get(i+1);
            int overlap = 0;
            
            for(int[] line : lines) {
                if(line[0] <= start && line[1] >= end) {
                    overlap++;
                }
            }
            
            if(overlap > 1) {
                answer += end - start;
            }
        }
        
        return answer;
    }
}
