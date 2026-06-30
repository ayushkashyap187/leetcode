class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        int zero=0;
        int l=0,r=0;
        while(r<n){
            if(nums[r]==1) {
                r++;
                ans=Math.max(ans,r-l);
            }else{
                zero++;
                
                if(zero>k){
                    if(nums[l]==0) {
                        zero--;
                        l++;
                    }else{
                        while(nums[l]!=0){
                            l++;
                        }
                        l++;
                        zero--;
                    }
                }
                r++;
                ans=Math.max(ans,r-l);
            }
        }
        return ans;
    }
}