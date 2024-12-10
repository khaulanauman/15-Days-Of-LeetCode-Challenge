class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //declaring three pointers
        int i = m - 1; // Last element in nums1
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1

        //end pe largest element pare hain cos the array is sorted
        //is liye we will compare last positions
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                //agar the greatest element in nums1 is also greater than the greatest in nums2
                //to nums1 ki akhri position pe usse daal do
                nums1[k--] = nums1[i--];
            } else {
                //agar nahi to matlab nums2 ka element is the greatest
                nums1[k--] = nums2[j--];
            }
        }

        //copying remaining elements of nums2, if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
