class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointers approach
        //1 will determine the unique elements
        //the next pointer will check for duplicates
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}