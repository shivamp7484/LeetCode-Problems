class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = 1;
        int count = 0;
        int sum = Integer.MIN_VALUE;
        while(high < nums.length && low < nums.length-1){
            if(nums[high]-nums[low] == k && nums[high]+nums[low]!=sum){
                sum = nums[high]+nums[low];
                count++;
                low++;
                high++;
            }
            else if(nums[high]-nums[low]<k){
                 high++; 
            }
            else{
                low++;
            }

            if(low == high){
                high++;
            }
        }
        return count;
    }
}