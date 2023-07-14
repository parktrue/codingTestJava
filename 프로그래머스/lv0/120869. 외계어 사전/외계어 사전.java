import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        HashMap<Character, Integer> spellCount = countChar(spell);

        for (String word : dic) {
            HashMap<Character, Integer> wordCount = countChar(word.split(""));
            if (wordCount.equals(spellCount)) {
                return 1;
            }
        }

        return 2;
    }

    public HashMap<Character, Integer> countChar(String[] chars) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (String c : chars) {
            charCount.put(c.charAt(0), charCount.getOrDefault(c.charAt(0), 0) + 1);
        }
        return charCount;
    }
}
