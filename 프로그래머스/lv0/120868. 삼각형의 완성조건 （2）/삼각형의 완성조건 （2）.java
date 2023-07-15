class Solution {
    public int solution(int[] sides) {
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);

        int result1 = Math.max(0, a + b - 1);
        int result2 = Math.max(0, b - a + 1);

        return result1 - result2 + 1;
    }
}
