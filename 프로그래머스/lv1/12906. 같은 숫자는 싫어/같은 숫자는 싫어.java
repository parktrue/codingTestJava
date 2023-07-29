import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        int prev = -1;
        for (int num : arr) {
            if (num != prev) {
                temp.add(num);
                prev = num;
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
