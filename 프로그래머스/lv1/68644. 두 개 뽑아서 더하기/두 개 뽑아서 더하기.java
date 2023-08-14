import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sumSet = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumSet.size()];
        int index = 0;
        for (Integer val : sumSet) {
            answer[index++] = val;
        }

        return answer;
    }
}
