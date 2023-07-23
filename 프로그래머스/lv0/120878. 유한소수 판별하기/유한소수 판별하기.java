class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int solution(int a, int b) {
        int gcdValue = gcd(a, b);
        b /= gcdValue;
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
