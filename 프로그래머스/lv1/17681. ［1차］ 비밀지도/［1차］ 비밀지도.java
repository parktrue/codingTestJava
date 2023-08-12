class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i]; // OR 연산으로 두 지도 합치기
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if ((combined & (1 << j)) == 0) { 
                    sb.insert(0, " ");
                } else {
                    sb.insert(0, "#");
                }
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
