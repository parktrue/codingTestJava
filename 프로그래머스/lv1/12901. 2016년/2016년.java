class Solution {
    public String solution(int a, int b) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int totalDays = b;
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        
        return dayNames[(totalDays - 1) % 7];
    }
}
