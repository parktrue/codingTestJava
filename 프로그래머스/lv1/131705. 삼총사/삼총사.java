class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 모든 가능한 조합을 검사하기 위한 세 개의 반복문
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 숫자의 합이 0인 경우 삼총사로 인정
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
