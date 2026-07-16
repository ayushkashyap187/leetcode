class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
    public int helper(int[] nums,int n,int[] dp){
        if(n==0) return nums[n];
        if(n<0) return 0;

        if(dp[n] != -1) return dp[n];

        int p=nums[n]+helper(nums,n-2,dp);
        int up=helper(nums,n-1,dp);
        return dp[n]=Math.max(p,up);
    }
}