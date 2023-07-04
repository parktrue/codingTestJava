import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count  = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                count++;
            }
        }
        
        int[] topRank = new int[count];
        int j = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                topRank[j] = rank[i];
                j++;
            }
        }

        Arrays.sort(topRank);
        int[] selectedIndex = new int[3];
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < rank.length; k++) {
                if(attendance[k] && topRank[i] == rank[k]) {
                    selectedIndex[i] = k;
                    break;
                }
            }
        }
        
        answer = (selectedIndex[0] * 10000) + (selectedIndex[1] * 100) + selectedIndex[2];
        return answer;
    }
}