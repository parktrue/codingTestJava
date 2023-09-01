class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public int lcm(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = (result * arr[i]) / gcd(result, arr[i]);
        }
        return result;
    }

    public int solution(int[] arr) {
        int answer = lcm(arr);
        return answer;
    }
}
