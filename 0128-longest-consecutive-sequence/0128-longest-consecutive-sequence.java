class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int largest =1;
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }
        for(int num :st ){
            if(!st.contains(num-1)){
                int count = 1;
                int x =num;

                while(st.contains(x+1)){
                    x+=1;
                    count++;
                }
                largest = Math.max(count ,largest);

            }

        }
        return largest;
    }
}