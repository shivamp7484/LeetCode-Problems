class Solution {
    public List<List<Integer>> threeSum(int[] ar) {
       Arrays.sort(ar);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<ar.length;i++){
            int left=i+1;
            int right=ar.length-1;
            while(left<right){
                 ArrayList<Integer> li = new ArrayList<>();
                int sum = ar[i]+ar[left]+ar[right];
                if(sum==0){
                    li.add(ar[i]);
                    li.add(ar[left]);
                    li.add(ar[right]);
                    ans.add(new ArrayList(li));
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else left++;
            }

        }
        return new ArrayList<>(ans);
    }
}