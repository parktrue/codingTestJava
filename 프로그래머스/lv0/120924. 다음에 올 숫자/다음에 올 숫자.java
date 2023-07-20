class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int diff = common[1] - common[0];
        boolean isArithmetic = true;
        boolean isGeometric = common[0] != 0 && common[1] % common[0] == 0; 
        int ratio = isGeometric ? common[1] / common[0] : 1;

        for (int i = 2; i < len && (isArithmetic || isGeometric); i++) {
            if (common[i] - common[i - 1] != diff) {
                isArithmetic = false;
            }
            if (isGeometric && common[i-1] != 0 && common[i] % common[i - 1] == 0 && common[i] / common[i - 1] != ratio) {
                isGeometric = false;
            }
        }

        if (isArithmetic) {
            return common[len - 1] + diff;
        } else if (isGeometric) {
            return common[len - 1] * ratio;
        }

        return 0;
    }
}
