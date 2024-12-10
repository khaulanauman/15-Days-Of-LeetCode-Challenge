import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
