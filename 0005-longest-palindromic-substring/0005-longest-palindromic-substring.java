class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        int temp=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palin(s.substring(i,j+1))) {
                    temp=Math.max(temp,j-i+1);
                    if(temp>ans.length()){
                        ans=new StringBuilder(s.substring(i,j+1));
                    }
                }
            }
        }
        return ans.toString();
    }
    public boolean palin(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}