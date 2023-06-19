class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        int j = 0;
        
        if (direction.equals("right")) {
            for (int i = 0; i < len - 1; i++) {
                if (i == 0) { 
                    answer[j] = numbers[len - 1];
                    j++;
                }
                answer[j] = numbers[i];
                j++;
            }
        } else {
            for (int i = 1; i < len; i++) {
                if (i == len - 1) { 
                    answer[len - 1] = numbers[0];
                }
                answer[j] = numbers[i];
                j++;
            }
        }
        return answer;
    }
}