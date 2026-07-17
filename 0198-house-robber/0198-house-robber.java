class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
    public int helper(int[] nums,int n,int[] dp){
        dp[0]=nums[0];
        int p=0;
        for(int i=1;i<=n;i++){
            if(i<=1) p=nums[i];
            else p=nums[i]+ dp[i-2];
            int up=dp[i-1];
            dp[i]=Math.max(p,up);
        }
        return dp[n];
    }
}