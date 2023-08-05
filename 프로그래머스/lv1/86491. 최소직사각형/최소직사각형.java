class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;
        
        for(int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }
        
        int answer = max_w * max_h;
        
        return answer;
    }
}
