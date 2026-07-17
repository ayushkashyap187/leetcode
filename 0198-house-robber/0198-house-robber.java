class Solution {
    public int rob(int[] nums) {
            int n=nums.length;
            int prev=nums[0];
            int prev2=0;
            int curr;
            int p;
            for (int i = 1; i < n; i++) {
                if(i<=1) p=nums[i];
                else p=nums[i]+ prev2;
                int up=prev;
                curr=Math.max(p,up);
                prev2=prev;
                prev=curr;
            }
            return prev;
        }
}