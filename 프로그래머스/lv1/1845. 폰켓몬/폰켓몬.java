import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> uniquePokemons = new HashSet<>();
        
        for(int num : nums) {
            uniquePokemons.add(num);
        }
        
        int needToSelect = nums.length / 2;
        
        return Math.min(uniquePokemons.size(), needToSelect);
    }
}
