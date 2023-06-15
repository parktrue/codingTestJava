class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int countOdd = 0;
        int countEven = 0;
        
        for (int i = 0; i < len; i++) {
            if (num_list[i] % 2 == 1) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        
        char[] oddChar = new char[countOdd];
        char[] evenChar = new char[countEven];
        
        int oddI = 0;
        int evenI = 0;
        for (int i = 0; i < len; i++) {
            if (num_list[i] % 2 == 1) {
                String strOdd = Integer.toString(num_list[i]);
                oddChar[oddI] = strOdd.charAt(0);
                oddI++;
            } else {
                String strOdd = Integer.toString(num_list[i]);
                evenChar[evenI] = strOdd.charAt(0);
                evenI++;
            }
        }
        
        String oddStr = new String(oddChar);
        String evenStr = new String(evenChar);
        
        int oddSum = Integer.parseInt(oddStr);
        int evenSum = Integer.parseInt(evenStr);
        
        int answer = oddSum + evenSum;
        
        return answer;
    }
}