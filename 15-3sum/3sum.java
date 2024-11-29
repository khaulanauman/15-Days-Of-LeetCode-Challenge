import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //sorting the array so duplicates are easier to detect
        Arrays.sort(nums);
        //iterating through the array
        for (int i = 0; i < nums.length - 2; i++) {
            //Continue if you find duplicate values
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1; // Left pointer
            int k = nums.length - 1; // Right pointer
            //making sure the two pointers dont intersect
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    //found a triplet
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Move pointers and skip duplicates
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++; // Increase sum by moving the left pointer
                } else {
                    k--; // Decrease sum by moving the right pointer
                }
            }
        }
        
        return result;
    }
}
