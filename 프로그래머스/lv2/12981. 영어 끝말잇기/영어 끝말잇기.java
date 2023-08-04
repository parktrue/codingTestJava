import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(wordList.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;
            }
            wordList.add(words[i]);
        }

        return answer;
    }
}
