import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();

        // Adding all elements of nums to a set so its easier to check
        for (int num : nums) {
            numbers.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
