class Solution {
    public int maxDepth(String s) {
        int count=0;
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
                count++;
                ans=Math.max(ans,count);
            }else if(c==')'){
                st.pop();
                count--;
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}