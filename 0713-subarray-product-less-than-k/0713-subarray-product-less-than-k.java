class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = i;
        int prod = 1;
        int count = 0;
        while(j<nums.length){
            prod *= nums[j];
            // if product greater or equal to k then shrink the subarray
            while(prod >= k && i<=j){
                prod = prod/nums[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
}