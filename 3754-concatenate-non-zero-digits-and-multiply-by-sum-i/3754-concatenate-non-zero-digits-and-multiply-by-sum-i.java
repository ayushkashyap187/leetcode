class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        long ans=str.charAt(0)-'0',sum=ans;
        int i=1;
        while(i<str.length()){
            int num=str.charAt(i)-'0';
            if(num != 0){
                ans=(ans*10)+num;
                sum+=num;
            }
            i++;
        }
        ans*=sum;
        return ans;
    }
}