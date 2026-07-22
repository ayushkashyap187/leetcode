class Solution {
    double ans=1;
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            n=-n;
            x=1/x;
        }
        return helper(x,N);
    }
    public double helper(double x,long n){
        
        if(n==0) return 1;
        
        double half=helper(x,n/2);
        if(n%2==0) return half*half;
        else return half*half*x;
    }
}