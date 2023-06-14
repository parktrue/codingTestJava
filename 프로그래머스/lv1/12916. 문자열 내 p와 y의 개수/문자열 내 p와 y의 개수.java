class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        char[] sChar = s.toCharArray();
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < len; i++) {
            if (sChar[i] == 'p' || sChar[i] == 'P') {
                countP++;
            } else if (sChar[i] == 'y' || sChar[i] == 'Y') {
                countY++;
            }
        }
        if (countP == countY) {
            answer = true;
        } else {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}