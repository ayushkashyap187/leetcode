class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        char[] arr=new char[n];
        int a=0;
        for(char c:s.toCharArray()){
            if (isVowel(c)) {
                arr[a++] = c;
            }
        }
        StringBuilder ans=new StringBuilder();
        Arrays.sort(arr,0,a);
        int i=0;
        for(char c:s.toCharArray()){
            if (isVowel(c)) {
                ans.append(arr[i++]);
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}