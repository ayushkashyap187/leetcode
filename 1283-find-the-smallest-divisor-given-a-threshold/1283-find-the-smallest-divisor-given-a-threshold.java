class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1,e=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>e) e=num;
        }
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            int result=0;
            for(int i=0;i<n;i++){
                if(nums[i]%m==0) result+=nums[i]/m;
                else result+=(nums[i]/m)+1;
            }
            if(result<=threshold) ans=Math.min(m,ans);
            if(result>threshold) s=m+1;
            else e=m-1;
        }
        return ans;
    }
}