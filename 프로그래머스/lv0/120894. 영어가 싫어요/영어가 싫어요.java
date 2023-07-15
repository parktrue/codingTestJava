class Solution {
    public long solution(String numbers) {
        String[] engNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            numbers = numbers.replaceAll(engNums[i], Integer.toString(i));
        }

        return Long.parseLong(numbers);
    }
}
