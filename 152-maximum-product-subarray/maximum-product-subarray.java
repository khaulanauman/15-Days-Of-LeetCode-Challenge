class Solution {
    public int maxProduct(int[] nums) {
        int prev=1;
        int next=1;
        int product=nums[0];
        for(int i=0;i<nums.length;i++){
            if(prev==0)
                prev=1;
            if(next==0)
                next=1;
            prev=prev*nums[i];
            next=next*nums[nums.length-1-i];
            //product will be max of both compared with previous product
            product=Math.max(product,Math.max(prev,next));
        }        
        return product;
    }    
}