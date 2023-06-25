import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morseArr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        List<String> morse = Arrays.asList(morseArr);
        String[] splitLetter = letter.split(" ");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < splitLetter.length; i++) {
            int index = morse.indexOf(splitLetter[i]);
            if (index != -1) {
                answer.append((char) (index + 'a'));
            }
        }

        return answer.toString();
    }
}