class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int temp=nums[i];
            if(temp>ans) ans=temp;
            for(int j=i+1;j<n;j++){
                temp *= nums[j];
                if(temp>ans) ans=temp;
            }
        }
        return ans;
    }
}