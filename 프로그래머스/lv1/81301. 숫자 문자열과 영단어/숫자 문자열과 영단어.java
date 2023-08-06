class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)) {
                answer.append(ch);
            } else {
                word.append(ch);
                for(int j = 0; j < 10; j++) {
                    if(word.toString().equals(words[j])) {
                        answer.append(j);
                        word.setLength(0);
                        break;
                    }
                }
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
}
