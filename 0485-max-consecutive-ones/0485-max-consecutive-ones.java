class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;

        int ans = 0;
        int i =0;
        
        while(i<nums.length){

            if(nums[i]==1){
                count++;
                i++;

                ans = Math.max(ans,count);
            }
            else if(nums[i]==0){
                count=0;
                i++;
            }
        }
        return ans;
    }
}