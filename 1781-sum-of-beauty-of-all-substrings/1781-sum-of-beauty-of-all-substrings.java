class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String temp=s.substring(i,j+1);

                int[] freq=new int[26];
                for(char c:temp.toCharArray()){
                    freq[c-'a']++;
                }
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;

                for(int f:freq){
                    if(f>0){
                        min=Math.min(min,f);
                        max=Math.max(max,f);
                    }
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}