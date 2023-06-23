import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("ad")) {
                list.remove(i);
                i--;
            }
        }

        return list.toArray(new String[0]);
    }
}
