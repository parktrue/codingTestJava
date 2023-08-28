import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correctCount = new int[3]; 

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                correctCount[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                correctCount[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                correctCount[2]++;
            }
        }

        int maxCorrect = Math.max(correctCount[0], Math.max(correctCount[1], correctCount[2]));

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < correctCount.length; i++) {
            if (correctCount[i] == maxCorrect) {
                resultList.add(i + 1); 
            }
        }

        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
