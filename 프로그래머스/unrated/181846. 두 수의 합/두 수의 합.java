class Solution {
    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int overflow = 0;

        while (i >= 0 || j >= 0) {
            int sum = overflow;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            answer.append(sum % 10);
            overflow = sum / 10;
        }
        
        if (overflow != 0) answer.append(overflow);
        return answer.reverse().toString();
    }
}