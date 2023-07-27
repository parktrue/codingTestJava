class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3); // 3진법으로 변환
        String reversedTernary = new StringBuilder(ternary).reverse().toString(); // 뒤집기
        int answer = Integer.parseInt(reversedTernary, 3); // 다시 10진법으로 변환
        return answer;
    }
}
