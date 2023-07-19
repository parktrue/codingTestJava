class Solution {
    public int solution(int n) {
        int convertedNumber = 0;
        int count = 0;

        while (count < n) {
            convertedNumber++;
            if (convertedNumber % 3 != 0 && String.valueOf(convertedNumber).indexOf('3') == -1) {
                count++;
            }
        }

        return convertedNumber;
    }
}
