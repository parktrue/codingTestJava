class Solution {
    public int solution(int n) {
        int answer = (n * 6) / get(n, 6);
        return answer / 6;
    }
    
    public int get(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
