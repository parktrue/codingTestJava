class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (String str : str_list) {
            char[] chars = str.toCharArray();
            char[] exChars = ex.toCharArray();
            boolean flag = false;

            for (int i = 0; i <= chars.length - exChars.length; i++) {
                for (int j = 0; j < exChars.length; j++) {
                    if (chars[i + j] != exChars[j]) {
                        break;
                    }
                    if (j == exChars.length - 1) {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                answer.append(str);
            }
        }
        return answer.toString();
    }
}
