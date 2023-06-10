class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int len = sides.length;
        int temp;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if(sides[j] > sides[j + 1]) {
                    temp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = temp;
                }
            }
        }
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}