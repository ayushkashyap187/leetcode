class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0,j=n-1;
        while(j>i){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        return;
    }
}