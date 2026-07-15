class Solution {
    public boolean judgeSquareSum(int c) {
        int n=(int)Math.sqrt(c);
        int i=0,j=n;
        while(j>=i){
            long sum=(long)j*j + (long)i*i;
            if(sum == c) return true;
            else if(sum> c) j--;
            else i++;
        }
        return false;
    }
}