import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{");
        Arrays.sort(sets, (a, b) -> a.length() - b.length());

        int[] answer = new int[sets.length];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < sets.length; i++) {
            String[] elements = sets[i].split(",");
            for (String element : elements) {
                int num = Integer.parseInt(element);
                if (!set.contains(num)) {
                    answer[i] = num;
                    set.add(num);
                    break;
                }
            }
        }

        return answer;
    }
}
