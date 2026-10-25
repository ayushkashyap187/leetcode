class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();

        Boolean[][] dp=new Boolean[m][n];

        return helper(s,p,m-1,n-1,dp);
    }
    boolean helper(String s,String t,int i,int j,Boolean[][] dp){
        if(i<0 && j<0) return true;
        if(j<0) return false;
        if(i<0 && j>=0){
            for(int jj=0;jj<=j;jj++){
                if(t.charAt(jj) != '*') return false;
            }
            return true;
        }
        if(dp[i][j] != null) return dp[i][j];

        if(s.charAt(i)==t.charAt(j) || t.charAt(j)=='?') return dp[i][j]= helper(s,t,i-1,j-1,dp);

        if(t.charAt(j)=='*') return dp[i][j]= helper(s,t,i-1,j,dp) || helper(s,t,i,j-1,dp);
        return false;
    }
}