class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0,e=0;
        int n=weights.length;
        int sum=0,max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        s=max;
        e=sum;

        while(s<=e){
            int m=s+(e-s)/2;
            int temp=m;
            int d=1;
            
            for(int i=0;i<n;i++){
                if(temp>=weights[i]) temp-=weights[i];
                else{
                    temp=m;
                    temp-=weights[i];
                    d++;
                }
            }
            if(d<=days) {
                ans=Math.min(ans,m);
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
}