import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int days = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + speeds[i] * days < 100) {
                days++;
            }

            int deployCount = 0;
            while (i < progresses.length && progresses[i] + speeds[i] * days >= 100) {
                deployCount++;
                i++;
            }
            answerList.add(deployCount);
            i--;
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] result1 = solution.solution(progresses1, speeds1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] result2 = solution.solution(progresses2, speeds2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
