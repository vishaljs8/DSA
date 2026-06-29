class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        int i =0;
        while(i<n){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            } else if (nums[i]!=1) {
                if(count>max){
                    max=count;
                }
                count=0;
            }
            i++;
        }
        return max;
    }
}