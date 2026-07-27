class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int l = Math.max(nums[0],nums[1]);
        int m = Math.min(nums[0],nums[1]);
        
        for(int i = 2; i < n; i++){
            if(nums[i]>l){
                m=l;
                l=nums[i];
            }
            else if(nums[i]>m){
                m=nums[i];
                
            }
        }
        return (l-1)*(m-1);
    }
}