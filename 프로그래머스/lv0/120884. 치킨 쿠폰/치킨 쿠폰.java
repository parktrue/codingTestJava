class Solution {
    public int solution(int chicken) {
        int totalServiceChicken = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int serviceChicken = coupon / 10;
            totalServiceChicken += serviceChicken;
            coupon = serviceChicken + coupon % 10;
        }

        return totalServiceChicken;
    }
}
