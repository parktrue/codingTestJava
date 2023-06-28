class Solution {
    public String solution(String code) {
        if (code.isEmpty()) {
            return "EMPTY";
        }

        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);

            if (currentChar == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    sb.append(currentChar);
                } else if (mode == 1 && i % 2 == 1) {
                    sb.append(currentChar);
                }
            }
        }

        String answer = sb.toString();
        if (answer.isEmpty()) {
            return "EMPTY";
        }

        return answer;
    }
}

