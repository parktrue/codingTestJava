class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int length = included.length;
        
        int[] abArr = new int[length];
        abArr[0] = a;
        for (int i = 1; i < length; i++) {
            abArr[i] = abArr[i - 1] + d;
        }
        for (int i = 0; i < length; i++) {
            if (included[i]) {
                answer += abArr[i];
            }
        }
        return answer;
    }
}