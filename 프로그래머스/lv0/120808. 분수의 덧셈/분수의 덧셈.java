class Solution {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int[] answer = new int[2];
    int lcmDenom = lcm(denom1, denom2);

    int sum = numer1 * (lcmDenom / denom1) + numer2 * (lcmDenom / denom2);

    int gcdSum = gcd(sum, lcmDenom);

    answer[0] = sum / gcdSum;
    answer[1] = lcmDenom / gcdSum;

    return answer;
  }

  int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}
