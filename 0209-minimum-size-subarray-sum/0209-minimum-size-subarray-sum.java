class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        int sum=0,ans=Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            if(sum >=target){
                while(sum>=target){
                    ans=Math.min(ans,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            }
                j++;
            
        }
        return ans==Integer.MAX_VALUE ? 0:ans;
    }
}